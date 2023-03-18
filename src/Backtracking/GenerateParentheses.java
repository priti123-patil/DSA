package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        ArrayList<String> res=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        backtrack(3,0,0,res,str);
        for(int i=0;i< res.size();i++)
        {
            System.out.println(res.get(i));
        }
    }
    public static void backtrack(int n, int open, int close, List<String> res, StringBuilder tstr)
    {
        if(tstr.length() == n*2)
        {
            res.add(tstr.toString());
            return;
        }
        if(open < n)
        {
            tstr.append("(");
            backtrack(n,open+1,close,res,tstr);
            tstr.deleteCharAt(tstr.length()-1);
        }
        if(close < open)
        {
            tstr.append(")");
            backtrack(n,open,close+1,res,tstr);
            tstr.deleteCharAt(tstr.length()-1);
        }
    }
}
