package Sorting;

import java.util.Arrays;

public class merge_two_sort_arr_without_aux_space {

	public static void main(String[] args) {
		long[] arr1= {1,3,4,5};
		long[] arr2= {0,2,6,7,8};
		
		int n=arr1.length;
		int m=arr2.length;
		
		int i=n-1;
		int j=0;
		
		while(i>=0 && j<m)
		{
			if(arr1[i]>arr2[j]) {
				
			
			long temp=arr1[i];
			arr1[i]=arr2[j];
			arr2[j]=temp;
			}
			i--;
			j++;
			
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
      System.out.println(java.util.Arrays.toString(arr1));
      System.out.println(java.util.Arrays.toString(arr2));
     
   
	}

}
