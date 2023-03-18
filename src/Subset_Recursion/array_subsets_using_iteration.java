package Subset_Recursion;

import java.util.*;

public class array_subsets_using_iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3};
		List<List<Integer>> ans=subsets(arr);
		System.out.println(ans);
		
	}
	
	public static List<List<Integer>> subsets(int[] arr)
	{
		List<List<Integer>> outer = new ArrayList<>();
		
		outer.add(new ArrayList<Integer>());
		for(int num:arr)
		{
			int n=outer.size();
			for(int i=0;i<n;i++)
			{
				List<Integer> internal=new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}
		
		return outer;
	}

}
