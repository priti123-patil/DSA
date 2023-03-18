package Recursion.src;

public class sumofdigits {

	public static void main(String[] args) {
		int n=789;
		
		System.out.println(sum_of_digits(n));
		
	}
	
	static int sum_of_digits(int n)
	{
		if(n==0)
			return n;
		
		return (n%10) + sum_of_digits(n/10) ;
	}

}
