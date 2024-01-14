
public class ShiftingR {
	public static void main(String[] args) {
//		int[] a = {1,2,3,4,5};
//		int n = 0;
//		while(n!=3) {
//		int temp = a[a.length-1];
//		
//		for (int i = a.length-1; i>0; i--) {
//			a[i] = a[i-1];
//		}
//		a[0] = temp;
//		n++;
//		}
//		for (int i:a) {
//			System.out.print(i + " ");
//		}
//		String a = ("Tony");
//		String result = "";
//		for (int i = a.length()-1 ; i>=0; i--) {
//			//result += a.substring(i,i+1);
//			result += a.charAt(i);
//		}
//		System.out.print(result);
		int [] arr = {3,4,2,4,2,1};
		int temp = 0;
		for (int i = 0; i<arr.length-1; i++) {
			for (int j = 0;j<arr.length-i-1;j++) {
				
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
