package Searching;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {2,4,4,4,4,6,7};
        int target=4;
        
        int[] ans= {-1,-1};
        
        ans[0]=search(arr,target,true);//searching for the first element
        ans[1]=search(arr,target,false);//searching for the last element 
        
        System.out.println(Arrays.toString(ans));
	}
	
	static int search(int[] arr,int target, boolean findfirstElement)
	{
		int ans=0;
		
		int l=0;
		int h=arr.length-1;
		int mid=0;
		
		while(l<=h)
		{
			mid=l+(h-1) / 2;
			if(target<arr[mid])
			{
				h=mid-1;
			}
			else if(target>arr[mid])
			{
				l=mid+1;
			}
			else
			{
				ans=mid;
				//searching again that array to find first element by dividing its space
				if(findfirstElement)
				{
					h=mid-1;
				}
				//searching again that array to find last element by dividing its space
				else
				{
					l=mid+1;
				}
			}
		}
		
		return ans;
	}

}
