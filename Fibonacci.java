class Fibonacci{  
	public static long fib(long n) {
	      if ((n == 0) || (n == 1))
	         return n;
	      else
	         return fib(n - 1) + fib(n - 2);
 }    
 public static void main(String args[]){            
	 long nthTerm = fib(10);
	 System.out.println(nthTerm);
 }  
}  
