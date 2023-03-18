package Recursion.src;

public class factorial_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(fact(4));
	}
	
	static int fact(int n)
	{
		if(n==1)
			return 1;
		
		return n*fact(n-1);
	}

}
