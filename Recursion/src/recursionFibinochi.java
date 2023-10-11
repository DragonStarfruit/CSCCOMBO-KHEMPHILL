
public class recursionFibinochi {
	static long[] fibArray;

	public static void main(String[] args) {

		// fib(3); (original) 
		// dynamic - puts the numbers in an array to call them faster 
		int term = 47;
		fibArray = new long[term + 1];
		System.out.println(fib(term));
		
	}

	private static long fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (fibArray[n] != 0) {
			return fibArray[n];
		}
		long nthFibNum = fib(n - 1) + fib(n - 2);
		fibArray[n] = nthFibNum;
		return nthFibNum;
	}

}
/*
 * private static long fib(int n){ 
 * (Fib original)
 * if (n == 0 || n == 1){ 
 *  	return n;
 * } 
 * return fib(n-1) + fib(n-2); 
 * }
 */