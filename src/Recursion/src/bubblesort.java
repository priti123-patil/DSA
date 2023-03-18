package Recursion.src;
import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {5,4,3,1};
		
		selection(arr, arr.length ,0,0);
		
		System.out.println(Arrays.toString(arr));
		
	}
	static void bubble(int[] arr , int i,int j)
	{
		if(i==0)
		{
			return ;
		}
		
		if( j < i )
		{
			if(arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			bubble(arr , i , j+1);
		}
			else
			{
				bubble(arr, i-1 , 0);
			}
	}
	
	static void selection(int[] arr,int i , int j,int max)
	{
		if(i==0)
		{
			return ;
		}
		
		if( j < i )
		{
			if(arr[j] > arr[max])
			{
				selection(arr , i , j+1, j);//sending jth index as maximum element index
			}
			else
			{
				selection(arr , i , j+1, max);
			}
		}
		else
		{
			int temp = arr[max];
			arr[max]=arr[i-1];
			arr[i-1]=temp;
			
			selection(arr , i-1 , 0, 0);
		}
	}


}
