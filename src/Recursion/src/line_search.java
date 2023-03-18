package Recursion.src;

public class line_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,6,1,45};
		
		System.out.println(linear_search(arr,6 , 0));
	}
	
	static int linear_search(int[] arr , int target, int index)
	{
	
		if(index == arr.length-1)
			return -1;
		if(arr[index]==target)
			return index;
		else
			return linear_search(arr,target,index+1);
	}

}
