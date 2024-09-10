package javaPrograms;

public class JavaBasics {
	

	
public static void main(String [] args) {
	revString("Mohit");
}	
	
// Reverse a String
	
	public static void revString(String str) {
		String stt = str;
		String rev = "";		
		
		for (int i = stt.length()-1; i >=0; i--) {
			rev = rev + stt.charAt(i);
		}
			System.out.println(rev);
	}
	
	
	public String revStr(String str) {
		
		if (str == null || str.length()<=1) {
			
			return str;
		}else {
			return revStr(str.substring(1)) + str.charAt(0);
		}
	}	
}
