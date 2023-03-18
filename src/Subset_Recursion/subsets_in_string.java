package Subset_Recursion;

import java.util.ArrayList;

public class subsets_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = subseq("","AAB");
	    System.out.println(a);
	    System.out.println(a.size());
	}
	
	//p-answer string
	//up-original string
	static int count=0;
	
	public static ArrayList<String> subseq(String p,String up )
	{
		//base condition
		//whenever up is empty p contains an answer
		if(up.isEmpty())
		{
			ArrayList<String> ans3=new ArrayList<>();
			ans3.add(p);
			return ans3;
		}
		char ch=up.charAt(0);
		//taking the character
		
		ArrayList<String> ans = subseq(p+ch , up.substring(1) );
		//ignoring the character
		ArrayList<String> ans2 = subseq(p , up.substring(1) );
		ans.addAll(ans2);
		return ans;
	}

}
