package javaPrograms;

public class JavaBasics4 { 
	
	
	public static void main (String [] args) {
		System.out.println("Reversed String is: "+nStr("Takishi"));
		System.out.println(" ");
		int [] array = {10, 555, 77, 44, 333, 999, 15};
		System.out.println("Maximum value in array is :"+findMax(array));
		System.out.println(" ");
		System.out.println("Minimum value in array is :"+findMin(array));
		System.out.println(" ");
		System.out.println("Is the String palinderome? :"+findPalin("Roor"));
		System.out.println(" ");
		System.out.println("Factorial of given number is: "+myFact1(6));
		System.out.println(" ");
		System.out.println("Factorial of given number is: "+myFact2(7));
		System.out.println(" ");
		System.out.println("Factorial of given number is: "+findFactorial(4));
		System.out.println(" ");
		System.out.println("Factorial of given number is: "+findFactorial2(3));
		
		System.out.println(" ");
		System.out.println("nth Fibonacci number from the given number is: "+ myFibonac(6));
		System.out.println(" ");
		System.out.println("Printing fobancci series with recursion");
		System.out.println(" ");
		for(int i=0; i<10; i++) {
			System.out.print(fibonac1(i)+" ");
		}
		
		System.out.println(" ");
		fibonacc(10);
		
		System.out.println(" ");
		for (int j=0; j<12; j++) {
			System.out.print(fibn2(j)+" ");
		}
		System.out.println(" ");
		fibn3(15);
	}

// Reverse a String

	public static String nStr(String m) {
		if (m==null) {
			throw new IllegalArgumentException("The String is null");
		}
		
		StringBuilder rev = new StringBuilder();
		for (int i = m.length()-1; i>=0; i--) {
			rev.append(m.charAt(i));
		}
		
		return rev.toString();
	}
	
// Find a maxNum

	public static int findMax(int [] n) {
		
		if(n==null || n.length ==0) {
			throw new IllegalArgumentException("The Array is null or empty");
		}
		
		int max = n[0];
		
		for (int i = 1; i< n.length; i++) {
			if (n[i] > max){
				max = n[i];
			}
		}
		return max;
	}
	
// Find minNUm
	
	public static int findMin(int [] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("The array is null or empty");
		}
		
		int min = arr[0];
		
		for (int i = 1; i< arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
// check palinderome
	
	public static boolean findPalin(String strr) {
		if (strr==null) {
			throw new IllegalArgumentException("The String is null");
		}
		String pln = strr.toLowerCase();
		StringBuilder strn = new StringBuilder();
		for (int i = pln.length()-1; i>=0; i--) {
			strn.append(pln.charAt(i));
		}
		return pln.equals(strn.toString());
	}
	
// find a factorial number using recursion and without recursion
	
// recursion 	
	public static long myFact1(int a) {
		if (a < 0) {throw new IllegalArgumentException("Negative numbers are not allowed");}
		if (a==0 || a==1) {
			return 1;
		}
		
		return a * myFact1(a-1);
	}
// without recursion	
	
	public static long myFact2(int b) {
		if (b<0) {throw new IllegalArgumentException("Negative numbers are not allowed");}
		if (b==0 || b==1) {
			return 1;
		}
		
		long result = 1;
		
		for (int i =1 ; i<=b; i++) {
			result *= i;
		}
		
		return result;
	}
	
	// find the factorial number
	
	public static long findFactorial(int d) {
		if (d<0) {throw new IllegalArgumentException("Negative numbers are not allowed");}
		if (d ==0 || d==1) {
			return 1;
		}
		return d * findFactorial(d-1);
	}
	
	public static long findFactorial2(int r) {
		if (r<0) {throw new IllegalArgumentException("Negative numbers are not allowed");}
	
		if (r==0 || r==1) {
			return 1;
		}
		long result = 1;
		for (int i = 1; i<=r; i++) {
			
			result *= i;
		}
		return result;
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
