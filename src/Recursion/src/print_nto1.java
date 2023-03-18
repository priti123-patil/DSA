package Recursion.src;

public class print_nto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5
		//5 4 3 2 1
		int n=10;
		
	    printn(10);
	}

	static void printn(int n)
	{
		if(n==1)
		{
			System.out.print(1+" ");
			return;
		}
		
		System.out.print(n+" ");
		
		printn(n-1);
		
	}
}
