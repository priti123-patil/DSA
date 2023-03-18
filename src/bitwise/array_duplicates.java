package bitwise;

public class array_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this code is to identify unique no in array
		int[] arr= {3,5,4,3,4,7,5,7,90,90,23};
		
		int n=arr.length;
		
		int unique=0;
		
		for(int i:arr)
		{
			unique ^= i ;
		}
		
		System.out.println(unique);
	}
    
}
