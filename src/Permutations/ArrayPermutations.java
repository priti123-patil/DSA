package Permutations;
import java.util.*;
public class ArrayPermutations {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }
    public static List<List<Integer>> permute(int[] nums) {
        return helper(new ArrayList<>(),nums);
    }
    public static List<List<Integer>> helper(List<Integer> p,int[] up){

        if(up.length == 0){
            List<List<Integer>> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<=p.size();i++){
            List<Integer> sub=new ArrayList<>();
            sub.addAll(p.subList(0,i));
            sub.add(up[0]);
            sub.addAll(p.subList(i,p.size()));
            res.addAll(helper(sub,Arrays.copyOfRange(up, 1, up.length)));
        }
        return res;
    }
}
