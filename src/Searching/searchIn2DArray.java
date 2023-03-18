package Searching;

import java.util.*;
public class searchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] mat= {
    		 {678,456,23,90,67},
    		 {56532,878,35},
    		 {23,67,89,43,78}};
     System.out.println(Arrays.toString(search(mat,35)));
     int[] arr= {12,345,2,6,7896};
	 // evenDigits is used to find out how many  numbers have even count of digits in the array
     int ans= evenDigits(arr);
     System.out.println(ans);
    /* while(arr[0]!=0)
     {
    	 arr[0]=arr[0]/10;
    	 System.out.println(arr[0]);
     }*/
		int[][] accounts={
				{2,3,4},{6,4,1},{10,20,2}
		};
		System.out.println(maxWealth(accounts));
     
	}
	static int evenDigits(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
           int no_of_digits=(int)Math.log10(nums[i])+1;
           
           int num=nums[i];
           // while(num>0)
            //{
               // num=num/10;
                //System.out.println(num);
             //   countlocal++;
           // }
            //System.out.println(countlocal);
           if(no_of_digits % 2 ==0)
           {
               count++;
           }
        }
        return count;
    }
	static int[] search(int[][] arr,int target)
	{
		if(arr.length==0)
			return new int[]{-1,-1};
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[i].length;j++)
	    	{
	    		if(arr[i][j]==target)
	    			return new int[] {i,j};
	    	}
	    }
	    return new int[] {-1,-1};
	}

	public static int maxWealth(int[][] accounts)
	{
		int max=Integer.MIN_VALUE;
		int total=0;
		for(int[] acc : accounts)
		{
			total=0;
			for(int ele : acc)
			{
				total = total + ele;
			}
			if(max < total)
			{
				max=total;
			}
		}
		return max;
	}

		
}
