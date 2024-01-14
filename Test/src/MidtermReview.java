
public class MidtermReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse String:
		String str = "HelloWorld";
		String result = "";
		for (int i = str.length()-1; i>=0; i--) {
			result += str.substring(i,i+1);
		}
		System.out.println(result);
		//Print trinagle
		int n = 4;
//		for (int i = 1; i<=n;i++) {
//			for (int j = n; j>=n-i; j--) {
//				System.out.print("  ");
//			}
//			for (int j = i; j<=n; j++) {
//				System.out.print(j+" ");
//			}
//			for (int j = n-1; j>=i; j--) {
//				System.out.print(j+ " ");
//			}
//			System.out.println();
//		}
		int[] arr = {1,2,3,4,5};
		
		int count = 0;
		while (count < 3) {
			int temp = arr[arr.length-1];
			for (int i = arr.length-1; i>0;i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			count++;
		}
		
	for (int i:arr) {
		System.out.print(i + " ");
	}
	String a = "tony";
	count = 0;
	str = "";
		while (count<2) {
			a = a.charAt(a.length()-1) + a.substring(0,a.length()-1);
			count++;
			}
		System.out.print(a);
		}
	}
