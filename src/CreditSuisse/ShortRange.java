package CreditSuisse;
import java.util.*;
public class ShortRange {
        public static void main(String[] args) {
            int n = 10;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1;i<=n;i++)
            {
                list.add(i);
            }
            int sum = 0;
            while(list.size() > 1)
            {
                for(int i=0; i<list.size() ; i += 2)
                {
                    sum += list.get(i);
                }
                for(int i=0;i<list.size();i++)
                {
                    list.remove(i);
                }
            }
            System.out.println(sum);
        }
    }
