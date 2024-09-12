package javaPrograms;

public class JavaBasics {
	

	
public static void main(String [] args) {
//	revString("Mohit");
	
	int array [] = {3, 10, 12, 15, 18};
	System.out.println("Maximum number in array is: "+findMaxNum(array));
	System.out.println(" ");
	
	System.out.println("Reversed string is :"+ revesedStr("Amitabh"));
	
	System.out.println(" ");
	System.out.println("Minimum number in array is: "+minNum(array));
	System.out.println(" ");
	System.out.println("Is given String a palinderome? : "+checkPalin("Hooh"));
	
	System.out.println(" ");
	System.out.println("Factorial of given number is : "+factorial(5));
	System.out.println(" ");
	System.out.println("Factorial of given number is : "+fact(10));
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
	
	
	// Finding maximum number in an array
	
	public static int findMaxNum(int [] arr) {
		
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("The array is empty or null");
		}
		
		int max = arr[0];
		for(int i=1; i< arr.length; i++) {
			
			if (arr[i] > max ) {
				max = arr[i];
			}
		}
		return max;
	}
	
// Find minimum number from an array
	
	public static int minNum(int [] array1) {
		if (array1==null || array1.length==0) { throw new IllegalArgumentException("The array is null or empty"); }
		 int min = array1[0];
		 for (int i=1; i< array1.length; i++) {
			 if (min > array1[i]) {
				 min = array1[i];
			 }
		 }
		 return min;
	}
	
// Check if string is palinderome or not
	
	public static boolean checkPalin(String Str1) {
		if (Str1==null) {throw new IllegalArgumentException("The String is empty or null");}
		
		String pln = Str1.toLowerCase();
		StringBuilder checkPln = new StringBuilder();
		for (int i = pln.length()-1; i >=0; i--) {
			checkPln.append(pln.charAt(i));
		}
		
		return pln.equals(checkPln.toString());
	}
	
	
// Reverse a String
	
	public static String revesedStr(String mn) {
		
		if(mn==null) {
			throw new IllegalArgumentException("String mn is having null value");
		}
		
		StringBuilder revrr = new StringBuilder();
		for (int i = mn.length()-1; i>=0; i--) {
			
			revrr.append(mn.charAt(i));
		}
		
		return revrr.toString();
	}
	
	// finding the factorial number - Method 1

	public static int factorial(int n) {
		if (n < 0) {throw new IllegalArgumentException("The factorial cannot be a negative number");}
		if (n==0|| n==1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
	// finding a factorial number method -2 without recursion

	public static int fact(int m) {
		
		if(m<0) {throw new IllegalArgumentException("Negative numbers are not allowed");}
		if (m==0 || m==1) { 
			return 1;
		}
		int res = 1;
		for (int i=1; i<= m; i++) {
			res *=i;
		}
	return res;
	}
	
// nth fibonacci number with iteration
	
		public static int myFibonac(int a) {
			
			if (a<0) {
				throw new IllegalArgumentException("Negative numbers are not allowed");
			}
			
			int b = 0;
			
			int c = 1;
			
			for (int i=2; i<=a; i++) {
				int d = b+c;
				b =c;
				c = d;
			}
			return c;
		}
		
		// Printing fibonacci series now with recursion
		
		public static int fibonac1(int s) {
			if (s < 0) {
				throw new IllegalArgumentException("Negative numbers are not allowed");
			}
			
			if (s==0) {
				return 0;
			}
			
			if (s==1) {
				return 1;
			}
			return fibonac1(s-1)+ fibonac1(s-2);
		}
		
		// fibonacci without recursion
		
		public static void fibonacc(int h) {
			if(h<0) { throw new IllegalArgumentException("Negative numbers are not allowed");}
			
			int a = 0;
			int b = 1;
			
			for (int i=0; i<h; i++) {
			System.out.print(a + " ");	
				int c = a + b;
				a = b;
				b =c ;
			}
		}
		
		
		// fibonacci with recursion
		
		public static int fibn2(int t) {
			if (t < 0) {throw new IllegalArgumentException("Negative numbers are not allowed");}
			if(t==0) {
				return 0;
			}
			if(t==1) {
				return 1;
			}
			return fibn2(t -1) + fibn2(t -2 );
		}
		
		// fibonacci with iteration
		
		public static void fibn3(int w) {
			if ( w< 0) {throw new IllegalArgumentException("Negative numbers are not allowed");}
			
			int a =0;
			int b=1;
			
			for (int i=0; i<w; i++) {
			
			System.out.print(a +" ");	
				int c = a +b;
				a=b;
				b=c;
			}
		}

}
