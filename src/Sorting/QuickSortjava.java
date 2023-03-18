package Sorting;

import java.util.*;

public class QuickSortjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println("Enter n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	    int[] arr=new int[n];
	    System.out.println("Enter elements of array:");
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();	    
	    }
	    quicksort(arr, 0, n - 1);
	    System.out.println(Arrays.toString(arr));
	}
	
	public static int partition(int[] arr, int start, int end)
	{
		int pivot = arr[start];
		
		int count = 0;
		for (int i=start+1;i<=end;i++)
		{
			if(arr[i]<=pivot)
			{
				count++;
			}
		}
		int pivotIndex = start + count;
		
		int temp=arr[pivotIndex];
		arr[pivotIndex]=arr[start];
		arr[start]=temp;
		
		int i=start;
		int j=end;
		
		while (i<pivotIndex && j>pivotIndex)
		{
			while(arr[i]<=pivot)
			{
				i++;
			}
			while(arr[j]>=pivot)
			{
				j--;
			}
			if (i<pivotIndex && j>pivotIndex) {				
				int temp2=arr[i];
				arr[i]=arr[j];
				arr[j]=temp2;
			}
		}
		
		return pivotIndex;
	}
	
	public static void quicksort(int[] arr, int start,int end)
	{
		if (start >= end)
			return;
		
		int pivot = partition(arr, start, end);
		quicksort(arr, 0, pivot - 1);
		quicksort(arr, pivot + 1, end);
	}
}
