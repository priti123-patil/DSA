package Recursion.src;

public class reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=13421;
		
		System.out.println(rev(n));
		
		
	}
	static int revnum=0;
	
	static int rev(int n)
	{
		revnum = revnum*10 + (n%10);
		
		if(n/10 == 0)
			return revnum;
		
		return rev(n/10);
		
	}

}
