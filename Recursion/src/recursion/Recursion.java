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
    	//this returns the nth fib term in the fibonacci sequence.
    	if(n == 1 || n == 2) {
    		return 1;
    	}else {
    		return fib(n-1) + fib(n - 2);
    	}
    }
     
    // Activity 4 int power (int x, int y)
    public static int power (int x, int y) {
    	if(y >= 1) {
    		return x * power(x,y-1);
    	}else {
    		return 1;
    	}
    }
     
    // Activity 4 int triangle(int x)
    public static void triangle(int height)
    {
    	if(height > 0) {
    		for(int i = 0; i < height; i++) {
    			System.out.print("*");
    		}
    		System.out.println();
    		triangle(height - 1);
    	}
    }
 
    // Project 4    public static int balance (int x, int y)
    public static int balance (int x, int y) {
    	if(x==y) {
    		//if they are equal it doesnt matter which one to return
    		return x;
    	}else if(x == y-1) {
    		//if x is the small by a value of 1 return it
    		return x;
    	}else if(y == x-1) {
    		//if y is smaller by 1 return it, this can only happen the first time
    		return y;
    	}else if(x<y) {
    		//we will have already returned if one is smaller by 1 so this is not an issue
    		//return the method but adding 1 to the smaller and subtracting 1 from the larger
    		return balance(x+1,y-1);
    	}else if(y < x) {
    		//this case can only happen the first time because after this, x will always be smaller
    		return balance(y+1, x-1);
    	}else {
    		//default
    		return 0;
    	}
    		
    }
     
    // Project 4    public static int Ackermann(int m, int n) 
    public static int Ackermann(int m, int n) {
    	//no clue what Ackermann is, I just ran tests for the requirements then recursed the method if thats how you would find the value.
		if(m == 0) {
			return n + 1;
		}else if(m > 0 && n == 0) {
			return Ackermann(m-1,1);
		}else if(m > 0 && n > 0)
		{
			return Ackermann(m-1, Ackermann(m,n-1));
		} 
		else {
			//will never be used so this can be whatever
			return 555;
		}
	}

	
	// Project 4 pi_approximation(int m)
	public static double pi_approximation(int n) {
		if(n != 0) {
			//while n has not yet reached 0 we will add the current value to the next lowest value using the foromala given
			return 4*(Math.pow(-1,n+1))/(2*n-1) + pi_approximation(n-1);
		}else{
			return 0;
		}
	}

	// Project 4 longestSubsequence(String s) 
	public static int lengthOfLongestSubsequence(String a, String b) {
		if(a.length() == 0 || b.length() == 0) {
		return 0;
		}else if(a.charAt(0) == b.charAt(0)) {
			return 1 + lengthOfLongestSubsequence(a.substring(1 ,a.length()), b.substring(1, b.length()));
		}else {
			return Math.max(lengthOfLongestSubsequence(a, b.substring(1,b.length())), lengthOfLongestSubsequence(a.substring(1, a.length()), b));
		}
	}

}
