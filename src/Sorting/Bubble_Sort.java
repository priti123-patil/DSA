package Sorting;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int[] arr= {6,5,4,3,2,1};
        
       solve(12,15);
        
		System.out.println(Arrays.toString(cyclicsort(arr)));
	}
	
	static void solve(int A, int B)
	{
	    int count = 0;
	 
	    // since, the numbers are less than 2^31
	    // run the loop from '0' to '31' only
	    for (int i = 0; i < 32; i++) {
	 
	        // right shift both the numbers by 'i' and
	        // check if the bit at the 0th position is different
	        if (((A >> i) & 1) != ((B >> i) & 1)) {
	            count++;
	        }
	    }
	 
	    System.out.println("Number of different bits : " + count);
	}
 
	
	//Cyclic sort
	static int[] cyclicsort(int[] arr)
	{
		
		int i=0;
        while(i < arr.length)
        {
            int num=arr[i]-1;
            
            if(i != num)
            {
                int temp=num;
                num=arr[i];
                arr[i]=temp;
            }
            else
            {
                i++;
            }
        }
        
        return arr;
		
	}
	
	//insertion sort
	static int[] insertionsort(int[] arr)
    {
	  for(int i=0 ; i < arr.length-1 ; i++)
	  {
		  for(int j=i+1; j>0; j--)
		  {
			  if(arr[j] < arr[j-1])
			  {
				  swap(arr,j,j-1);
			  }
			  else
			  {
				  break;
			  }
		  }
	  }
	  return arr;
    }
	
	//selection sort
	
	static int[] selectionsort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int last=arr.length-i-1;
			
			//after sorting one by one it will not come again to the array
			//we will only see to the unsorted array
			
			//start is always by 0 and last is decreasing 
			//we are setting the maximum element to the last 
			
			int maxIndex=getMaxIndex(arr,last);
			
			//after finding maximum element in the array we are putting it to the end of unsorted array
			
			swap(arr,last,maxIndex);

		}
		return arr;
	}
	
	//returns the index of the maximum element of the array
	static int getMaxIndex(int[] arr,int e)
	{
		int max=0;
		
		for(int i=0;i<=e;i++)
		{
			if( arr[i] > arr[max]  )
			{
				max=i;
			}
		}
		
		return max;
	}
	
	static void swap(int[] arr,int first,int last)
	{
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}

	static int[] bubblesort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				//descending order
				/*if(arr[j]>=arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}*/
				
				//ascending order
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
			}
			
		}
		return arr;
	}
}
