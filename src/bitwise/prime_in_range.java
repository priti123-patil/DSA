package bitwise;

import java.util.*;
public class prime_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=15;
		
		for(int i=1;i <= num;i++)
		{
			
			System.out.println( i + " "+ isPrime(i));
		}
		HashMap<Integer,Integer> map ;
		
		//for(var v: map.values())
		//{
			
		//}
	}
	
	static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		
		int j=2;
		
		//i <= sqrt(n)
		// i*i <= ( sqrt(n) )^2
		// i*i <= n
		while( j <= Math.sqrt(n))
		{
			if( n % j == 0 )
				return false;
			j++;
		}
		return true;
	}

}
