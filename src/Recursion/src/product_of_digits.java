package Recursion.src;

public class product_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=987;
		
		System.out.println(prod(n));
		
	}

	static int prod(int n)
	{
		if(n/10 == 0)
			return n;
		
		return (n%10)*prod(n/10);
	}
}
