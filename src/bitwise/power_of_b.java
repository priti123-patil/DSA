package bitwise;

public class power_of_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a raise to b
		
		// 3 to the power of 9 is = 3*3*3*3*3*3*3*3*3
		// 9 in binary is 1001
		// 3 to the power 9 is equal to 
		//   3 to the power of 1 
		// * 3 to the power of 8
		// 3 to the power of 9
		
		// 1 in binary is 0001
		// 8 in binary is 1000
		// 9 in binary is 1001
		
		// so to calculate we are considering only set bits that are 1
		//and 0 will be ignored
		
		long power = 9;
		
		long ans = 1;
		
		long base= 3;
		
		while( power > 0 )
		{
			long last = power&1 ;
			
			if(last == 1)
			{
				ans= ans * base;
			}
			
			base = base * base ;
			
			power = power >> 1;
		}
		
		System.out.println( " 3 to the power of 6 is " +ans);
		
	}

}
