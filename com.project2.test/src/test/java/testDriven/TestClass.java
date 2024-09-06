package testDriven;


public class TestClass {

	public static void main(String[] args) {
	 System.out.println("Reversed number is: "+revers(12345));
	 System.out.println("+++++++++++++++++++++++++++++++++++++");
	 checkPalindrome("Taimiat");
	 revStr("Deepk Kumar");
	 String Str1 = "Dheeraj";
	 String Str2 = "Jeej";
	 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	 checkPalindrome2(Str1);
	 checkPalindrome2(Str2);
	
	}

	// Reversing a number
	public static int revers(int num) {
		int reverss = 0;
		System.out.println("Given number is: "+ num);
		System.out.println("--------------------------------------------");
		while (num !=0) {
			 reverss = reverss * 10 + num % 10;
			 num = num / 10;
		 }
		return reverss;
	}
	
// check if a string is palindrome
	
	public static boolean checkPalindrome(String Sm)
	{
	  String S = Sm;
	  String strPln = "";
	 System.out.println("Given String is: '"+S+"'");
	 System.out.println("++++++++++++++++-------------------------------------");
	for (int i = S.length() - 1; i >= 0; --i) {
		strPln = strPln + S.charAt(i);
	}
	if (S.toLowerCase().equals(strPln.toLowerCase())) {
		System.out.println("String '"+S+"' is palindrome");
	}
	else {
		System.out.println("String '"+S+"' is not a palindrome");
	}
	return true;
	}
	
	// reverse a String
	
	public static void revStr(String T) {
		
		String s1 = T;
		System.out.println("Given String is: "+s1);
		int r = s1.length();
		
		String rev = "";
		
		for (int i = r-1; i>=0; --i) {
			rev = rev + s1.charAt(i);
		}
		System.out.println("Reversed String is: "+rev);
	}
	
	public static boolean checkPalindrome2(String am)
	{
	  String S = am;
	  String strPln = "";
	 System.out.println("Given String is: '"+S+"'");
	 System.out.println("++++++++++++++++-------------------------------------");
	for (int i = S.length() - 1; i >= 0; --i) {
		strPln = strPln + S.charAt(i);
	}
	if (S.toLowerCase().equals(strPln.toLowerCase())) {
		System.out.println("String '"+S+"' is palindrome");
	}
	else {
		System.out.println("String '"+S+"' is not a palindrome");
	}
	return true;
	}
	
	
	
	
	
}
