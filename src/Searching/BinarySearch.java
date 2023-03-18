package Searching;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr1= {900,800,456,78,9};
     System.out.println(Arrays.toString(arr1));
     System.out.println("9 found at " + Order_agnostic_search(arr1,9)+" index");
     
		int[] arr= {7,9,14,15,17,19,21};
		int x=17;
		int k=3;
		
		System.out.println(findClosestElements(arr,k,x));
		System.out.println(BinarySearch_1D_Array(arr1,x));
		
	}
	static ArrayList<Integer> findClosestElements(int[] arr, int k, int x) {
	      
        ArrayList<Integer> result=new ArrayList<>();
        
        if(x == -1)
        {
            for(int i=0;i<k;i++)
            {
                result.add(arr[i]);
            }
            return result;
        }
        
        int l=0;
        int h=arr.length-1;
        int index=0;
        int mid=0;
        while(l<=h)
        {
			mid=l+(h-l)/2;//it's always good to take l+(h-l)/2 instead of l+h/2 
			if(x == arr[mid])
			{
				index=mid;
				break;
			}	
			else
			{
				if(x < arr[mid])
					h=mid-1;
				else
					l=mid+1;
			}
		}
        System.out.println(index);
        
        int i1=index-1;
        int j=index+1;
        k=k-1;
        result.add(arr[index]);
        System.out.println(" arr[i1] = "+arr[i1]);
    	System.out.println(" arr[j] = "+arr[j]);
    	System.out.println("Befor");
        while(i1<=j && k!=0)
        {
            if((Math.abs(arr[i1]-x)==(arr[j]-x)))
            {
            	result.add(arr[i1]);
            	result.add(arr[j]);
            	k=k-1;
                
            }
            else if((Math.abs(arr[i1]-x)<(arr[j]-x))  )
            {
            	result.add(arr[i1]); 
                System.out.println(" arr[i1] = "+arr[i1]);
            }
            else
            {
            	result.add(arr[j]);
            }
            
            if(j!=arr.length-1)
            {
                j++;
            }
            if(i1!=0)
            {
            	i1--;
            }
            k--;
        }
        return result;
    }
	
	static int BinarySearch_1D_Array(int[] arr,int target)
	{
		int l=0;
		int h=arr.length-1;
		int mid=0;
		
		while(l<=h)
		{
			mid=l+(h-l)/2;//it's always good to take l+(h-l)/2 instead of l+h/2 
			if(target == arr[mid])
			{
				return mid;
			}
				
			else
			{
				if(target < arr[mid])
					h=mid-1;
				else
					l=mid+1;
			}
		}
			
		return -1;
		
	}
	
	static int Order_agnostic_search(int[] arr,int target)
	{
		if(orderofstoring(arr))
			return BinarySearch_1D_Array(arr,405);
		else
		{
			//descending order code
			int l=0;
			int h=arr.length-1;
			int mid=0;
			
			while(l<=h)
			{
				mid=l+(h-l)/2;//it's always good to take l+(h-l)/2 instead of l+h/2 
				if(target == arr[mid])
				{
					return mid;
				}
					
				else
				{
					if(target > arr[mid])
						h=mid-1;
					else
						l=mid+1;
				}
			}	
		}
		
		return -1;
	}

	static boolean orderofstoring(int[] arr)
	{
		if(arr[0] <= arr[arr.length-1])
		{
			return true;
		}
		return false;
	}

    
	
}
