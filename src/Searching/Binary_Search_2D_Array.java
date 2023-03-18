package Searching;

import java.util.Arrays;

public class Binary_Search_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {{10,20,30,40},
				{15,25,35,45},
				{28,29,37,48},//37 is at [2,2]
				{33,34,38,50}};
		
		int[] ans=new int[2];
		
		//System.out.println("Answer found at :"+ Arrays.toString(ans));
		
		int[][] arr2= {{1,2,3,4,5},
				       {6,7,8,9,10},
				       {11,12,13,14,15},
				       {16,17,18,19,20}};
		
		
		ans=search_in_sorted(arr2,14);
		System.out.println("Answer found at :"+ Arrays.toString(ans));
		}
	

	//ROWWISE AND COLUMNWISE SORTED MATRIX NOT STRICTLY SORTED
	static int[] search(int[][] arr,int target)
	{
		int row=0;
		int column=arr.length - 1;
		
		while(row<arr.length && column>=0)
		{
			if(arr[row][column]==target)
			{
				return new int[] {row,column};
			}
			else if(arr[row][column]>target)
			{
				column--;
			}
			else
			{
				row++;
			}
		}
		
		return new int[] {-1,-1};
	}
	
	//search in the row provided between columns
	static int[] simple_binary_search(int[][] arr, int row, int columnStart, int columnEnd, int target)
	{
		while(columnStart<=columnEnd)
		{
			int mid=columnStart + (columnEnd - columnStart) /2;
			if(arr[row][mid]==target)
			{
				return new int[] {row,mid};
			}
			
			if(arr[row][mid] < target)
			{
				columnStart=mid+1;
			}
			else
			{
				columnEnd=mid-1;
			}
			
		}
		return new int[] {-1,-1};
	}
	//STRICTLY SORTED MATRIX
	static int[] search_in_sorted(int[][] arr,int target)
	{
		int row = arr.length;
		int columns = arr[0].length;
		
		
		int rowStart = 0;
		int rowEnd = row-1;
		int columnMid = columns/2;
		
		if(row==1)
		{
			return simple_binary_search(arr,0,0,columns-1,target);
		}
		
		//take the middle column
		//and perform binary search on middle column
		
		//run the loop till the 2 rows are remaining
		
		while(rowStart < (rowEnd - 1))
		{
			int mid=rowStart+ (rowEnd-rowStart) /2;
			
			
			if(arr[mid][columnMid]==target)
			{
				return new int[] {mid,columnMid};
			}
			if(arr[mid][columnMid]<target)
			{
				rowStart=mid;
			}
			else
			{
				rowEnd=mid;
			}
		}
		
		//now after this loop we have 2 rows remaining 
		
		//check whether the target is in the column of 2 rows 
		
		if(arr[rowStart][columnMid]==target)
		{
			return new int[] {rowStart,columnMid};
		}
		if(arr[rowStart+1][columnMid]==target)
		{
			return new int[] {rowStart+1,columnMid};
		}
		
		//otherwise check in 1,2,3,4 half
		
		//1st half
		if(target<=arr[rowStart][columnMid-1])
		{
			return simple_binary_search(arr,rowStart,0,columnMid-1,target);
		}
		
		//2nd half
		if(target>=arr[rowStart][columnMid+1] && target<=arr[rowStart][columns-1])
		{
			return simple_binary_search(arr,rowStart,columnMid+1,columns-1,target);
		}
		
		//3rd half
		if(target<=arr[rowStart+1][columnMid-1])
		{
			return simple_binary_search(arr,rowStart+1,0,columnMid-1,target);
		}
		else
		{
		
			//4th half
			//if(target<=arr[rowStart + 1 ][columnMid + 1])
			return simple_binary_search(arr,rowStart+1,columnMid+1,columns-1,target);
			
		}
		
	}
}
