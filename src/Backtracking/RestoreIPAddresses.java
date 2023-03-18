package Backtracking;
import java.util.*;

public class RestoreIPAddresses {
    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("101023"));
    }
    public static List<String> restoreIpAddresses(String s) {
        ArrayList<String> IP=new ArrayList<>();
        if(s.length()>12)
        {
            return IP;
        }
        helper(0,s,IP,new ArrayList<>());
        return IP;
    }

    public static void helper(int pos,String s,ArrayList<String> IP,ArrayList<String> chunks)
    {
        if(pos == s.length() && chunks.size() == 4)
        {
            IP.add(String.join(".",chunks));
            return ;
        }

        for(int i = 1; i <= 3 && pos+i <= s.length(); i++)
        {
            String part=s.substring(pos , pos+i);
            if( !(part.charAt(0) == '0' && part.length() > 1 || Integer.parseInt(part) > 255))
            {
                chunks.add(part);
                helper(pos+i,s,IP,chunks);
                chunks.remove(chunks.size()-1);
            }
        }
    }
}
