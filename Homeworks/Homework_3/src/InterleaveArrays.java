import java.util.Arrays;
public class InterleaveArrays {
	public static int[] interleaveArrays(int[] array1, int[] array2) {
		int count1 = 0;
		int count2 = 1;
		int[] result = new int [array1.length + array2.length];
		int len = 0;
		
		if (array1.length-array2.length > 0) {  // when array 1's length is bigger than array2's length
			len = array2.length;
			for (int i = 0; i<len;i++,count1+=2) {
				result[count1] = array1[i];
			}
			
			for (int i = 0; i<len;i++,count2+=2) {
				result[count2] = array2[i];
			}
			count2--; 
			for (int i = len; i<array1.length;i++,count1++) {
				result[count1] = array1[i];
			}
		}
		else if (array1.length-array2.length <= 0) {			// // when array 2's length is bigger than array1's length
			len = array1.length;
			for (int i = 0; i<len;i++,count1+=2) {
				result[count1] = array1[i];
			}
			for (int i = 0; i<len;i++,count2+=2) {
				result[count2] = array2[i];
			}
			count2--;
			for (int i = len; i<array2.length;i++) {
				result[count2++] = array2[i];
			}
		}
			
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6}))); //returns [1, 2, 3, 4, 5, 6]
		System.out.println(Arrays.toString(interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8}))); //returns [10, 2, 20, 4, 30, 6, 40, 8, 50, 60, 70, 80]
		System.out.println(Arrays.toString(interleaveArrays(new int[]{1,3,5,7}, new int[]{2,4,6,8,10})));// returns [1, 2, 3, 4, 5, 6, 8, 10]
		System.out.println(Arrays.toString(interleaveArrays(new int[]{0}, new int[]{2,4,6,8,10}))); //returns [0,2,4,6,8,10]
		System.out.println(Arrays.toString(interleaveArrays(new int[]{1,3,5,7,9,11,13,15,17}, new int[]{2,4,6,8,10}))); //returns[[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17]
	}

}
