package Recursion.src;

public class lin_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,7,3,5,7,10};
		System.out.println(search(arr,0,7));
		
	}
	
	public static int search(int[] arr,int index,int target)
	{
		if(arr.length==index)
			return -1;
		if(arr[index]==target)
			return index;
		
		return search(arr,index+1,target);
	}

}
