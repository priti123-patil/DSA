package Recursion.src;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=456654;
		
		System.out.println(palindromic(n));
		
		
	}
	static int revnum=0;
	
	static int rev(int n)
	{
		revnum = revnum*10 + (n%10);
		
		if(n/10 == 0)
			return revnum;
		
		return rev(n/10);
		
	}
	
	static boolean palindromic(int n)
	{
		return n==rev(n);
	}
}
