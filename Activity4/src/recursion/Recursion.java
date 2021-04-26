package recursion;

public class Recursion {
	
	// Sum up to N
	public static int sum_up(int n) {
		// Base case
		if (n <= 0 ) {
			return 0;
		}
		return n + sum_up(n-1);
	}
	
	// Tail-recursion
	public static int sum_up_tail(int n) {
		return sum_up_tail(n, 0);
	}
	public static int sum_up_tail(int n, int x) {
		if (n < 1) {
			return x;
		}
		else {
			return sum_up_tail(n-1, x + n);
		}
	}
	
	// Print up to n
	public static void print_up_to(int n) {
		print_up_to(n, 1);
		System.out.println();
	}	
	public static void print_up_to(int n, int current) {
		System.out.print(current + " ");
		if (current < n) {
			print_up_to(n, current+1);
		}
	}
	
	// Factorial
	public static int fact(int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}
	
	// Factorial - tail-recursive
	public static int fact_tail(int n) {
		return fact_tail(n, 1);
	}
	public static int fact_tail(int n, int f) {
		if (n <= 1) {
			return f;
		}
		else {
			return (fact_tail(n-1, n * f));
		}
	}
	
    // Activity 4 int fib(int n) 
    public static int fib (int n)
    {
    	return 0;
    }
     
    // Activity 4 int power (int x, int y)
    public static int power (int x, int y) {
    	return 0;
    }
     
    // Activity 4 int triangle(int x)
    public static void triangle(int height)
    {
    }
 
    // Project 4    public static int balance (int x, int y)
    public static int balance (int x, int y) {
		return 0;
    }
     
    // Project 4    public static int Ackermann(int m, int n) 
    public static int Ackermann(int m, int n) {
		return 0;
    }

	
	// Project 4 pi_approximation(int m)
	public static double pi_approximation(int n) {
		return 0;
	}

	// Project 4 longestSubsequence(String s) 
	public static int lengthOfLongestSubsequence(String a, String b) {
		return 0;
	}

}
