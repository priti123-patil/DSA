package bitwise;

public class prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 99 ;
		
		boolean prime=true;
		
		for(int i=2;i<n;i++)
		{
			if( n % i == 0) {
				prime = false;
			    break ;
			}	
		}
		if(prime)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

}
