package Subset_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class substes_without_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,5,3,3};
		List<List<Integer>> ans=subsets(arr);
		for(List<Integer> list: ans)
		{
			System.out.println(list);
		}
	}
	public static List<List<Integer>> subsets(int[] arr)
	{
		Arrays.sort(arr);
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		int start=0;
		int end=0;
		for(int i=0;i<arr.length;i++)
		{
			start=0;
			//if the arr has duplicates
			//only add the element in newly created subsets
			if( i>0 && arr[i]==arr[i-1] )
			{
				start=end+1;
				//System.out.println(start);
				//it will not add the same element again in same sets 
				//it will start from the newly created subsets
			}
			end=outer.size()-1;
			//System.out.println(start);
			//System.out.println(end);
			int n=outer.size();
			for(int j=start;j<n;j++)
			{
				List<Integer> internal=new ArrayList<>(outer.get(j));
				internal.add(arr[i]);
				outer.add(internal);
			}
		}
		return outer;
	}
}
