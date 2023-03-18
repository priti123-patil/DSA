package Backtracking;
import java.util.*;

public class PalindromePartitioning {
    public static void main(String[] args) {
        System.out.println(partition("abba"));

    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> partitions = new ArrayList<String>();
        divideString(0,partitions,ans,s);
        return ans;
    }

    public static boolean checkPalindrome(String s, int i,int j)
    {
        while(i<=j)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void divideString(int pos, List<String> partitions, List<List<String>> ans, String s)
    {
        if(pos == s.length())
        {
            ans.add(new ArrayList<>(partitions));
            return ;
        }
        for(int i=pos; i<s.length(); i++)
        {
            if(checkPalindrome(s,pos,i))
            {
                partitions.add(s.substring(pos,i+1));
                divideString(i+1, partitions, ans, s);
                partitions.remove(partitions.size()-1);
            }
        }
    }
}
