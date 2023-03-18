package bitwise;

public class xor_till_a {

	public static void main(String args[])
	{
		
		//calculate the xor till a from 0
		
		// 0^1^2^3^4^5^6...^10 == ?
		
		//after every 4 numbers the xor is itself a
		
		// 4^ = 4 8^ =8  12^ = 12
		
		//after 4 it keeps repeating the pattern
		//that is why we take %4 
		
		System.out.println(xor(5));
		
		System.out.println( xor_in_range( 3 , 9) );
		
	}
	
	static int xor_in_range(int a, int b)
	{
		// xor of a till b
		// 3^4^5...^9
		// so we dont need 0 to a-1 xors
		// so we will calculate xor of 0 till b and minus xor of 0 till a-1
		
		// a^....^b= 0^...^b - 0^...^(a-1)
		
		int total = xor(b) ^ xor( a - 1);
		
		return total ;
		
	}
	
	static int xor(int a)
	{
		if(a % 4 == 0)
			return a;
		
		if(a % 4 == 1)
			return 1;
		
		if(a % 4 == 2)
			return a+1;
		
		return 0;
	}
}
