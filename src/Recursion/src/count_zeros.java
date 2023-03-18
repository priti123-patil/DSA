package Recursion.src;

public class count_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=120034;
		
		System.out.println(count(n,0));
	}
	
	static int count(int n,int count)
	{
		if(n==0)
			return count;
		
		int ele=n%10;
				
		if(ele == 0)
		{
			return count(n/10,count+1);
		}

		return	count(n/10,count);
	}

}
