package Recursion.src;

public class product_nto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		System.out.println(prod(n));
		
	}
	
	static int prod(int n)
	{
		if(n==1)
			return 1;
		
		return n*prod(n-1);
	}

}
