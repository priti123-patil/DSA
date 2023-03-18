package Recursion.src;

public class check_soreted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {8,4,6,89,90};
		
		System.out.println(check_array(arr,0));
		
	}
	
	static boolean check_array(int[] arr , int i)
	{
		if(i==arr.length-1)
			return true;
					
     	return  arr[i]<arr[i+1] && check_array(arr,i+1);	
	}

}
