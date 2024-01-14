public class NumberSystems {
	public static String reverse(String s) {
    	String temp = "";
    	for (int i = s.length()-1; i>=0; i--) {
    		temp += s.substring(i,i+1);
    	}
    	return temp;
	}
    public static int baseX2decimal(int base, String s) {
    	int result = 0;
    	int s1 = Integer.parseInt(s);
    	for (int i = 0; i<s.length(); i++) {
    		result += ((s1%((int)(Math.pow(10, i+1)))/(int)(Math.pow(10,i)))*(int)(Math.pow(base,i)));
    	}
    	return result;
    }
    
    public static String decimal2BaseX(int base, int dec){
    	String result = "";
    	int temp = dec;
    	while (temp != 0)
    	{
    	temp = temp / base;
    	result += temp%base;
    	}
    	return result;
    }

    public static int hexadecimal2decimal(String hex){
    	int result = 0;
    	int pow = 0;
    	for (int i = hex.length()-1; i>=0; i--) {
    		if (hex.charAt(i) == 'A') {
    			result += 10*(int)(Math.pow(16, pow));
    		}
    		else if (hex.charAt(i) == 'B') {
    			result += 11*(int)(Math.pow(16, pow));
    		}
    		else if (hex.charAt(i) == 'C') {
    			result += 12*(int)(Math.pow(16, pow));
    		}
    		else if (hex.charAt(i) == 'D') {
    			result += 13*(int)(Math.pow(16, pow));
    		}
    		else if (hex.charAt(i) == 'E') {
    			result += 14*(int)(Math.pow(16, pow));
    		}
    		else if (hex.charAt(i) == 'F') {
    			result += 15*(int)(Math.pow(16, pow));
    		}
    		else {
    			result += Integer.parseInt(hex.substring(i,i+1)) * (int)(Math.pow(16, pow));
    		}
    		pow++;
    	}
    	return result;
    }

    public static String decimal2binary(int n){
    	String result = "";
    	int temp = n;
    	while (temp != 0)
    	{
    	temp = temp / 2;
    	result += temp%2;
    	}
    	return result;
    }

    public static String decimal2hex(int n){ 
    	int temp = n;
    	int remainder = 0;
    	String result = "";
    	while (temp != 0) {
    		
    		remainder = temp % 16;
    		if (remainder == 10) {
    			result += "A";
    		} 
    		if (remainder == 11) {
    			result += "B";
    		} 
    		if (remainder == 12) {
    			result += "C";
    		} 
    		if (remainder == 13) {
    			result += "D";
    		} 
    		if (remainder == 14) {
    			result += "E";
    		} 
    		if (remainder == 15) {
    			result += "F";
    		} 
    		else if (remainder < 10) {
    			result += remainder;
    		}
    		temp = temp / 16;
    	}
    	return reverse(result);
    }

    public static int binary2decimal(String b){ 
    	String temp = reverse(b);
    	int result = 0;
    	for (int i = 0; i< temp.length(); i++) {
    		if (temp.charAt(i) == '1') {
    			result += Math.pow(2, i);
    		}
    	}
    	return result;
    }

    public static void main(String[] args) {
         System.out.println(hexadecimal2decimal("A1")); // 161
         System.out.println(decimal2binary(10)); // 1010
//
         System.out.println(decimal2hex(161)); // A1

         System.out.println(baseX2decimal(2,"1010")); // 10

    }

}
