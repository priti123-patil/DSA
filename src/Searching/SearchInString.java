package Searching;

import java.util.Scanner;

public class SearchInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name " );
       String s=sc.next();
       System.out.println("Enter the character " );
       char c=sc.next().charAt(0);
       System.out.println(search(s,c));
	}
	static boolean search(String s,char target)
	{
		if(s.length()==0)
			return false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==target)
			{
				return true;
			}
		}
		return false;
	}

}
