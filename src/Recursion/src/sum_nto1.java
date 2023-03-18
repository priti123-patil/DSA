package Recursion.src;

public class sum_nto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8;
		
		System.out.println(sum(n));
		
	}

	static int sum(int n)
	{
		if(n==1)
			return 1;
		return n+sum(n-1);
	}
}
