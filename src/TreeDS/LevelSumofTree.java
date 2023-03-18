package TreeDS;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

 class TreeNodeC{
    int val;
    TreeNodeC left;
    TreeNodeC right;
    TreeNodeC(){};
    TreeNodeC(int val)
    {
        this.val = val;
    }
    TreeNodeC(int val,TreeNodeC left,TreeNodeC right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LevelSumofTree {
    public static void main(String[] args) {
        TreeNodeC root = new TreeNodeC(5);
        root.left = new TreeNodeC(2);
        root.right = new TreeNodeC(8);
        root.left.left = new TreeNodeC(1);
        root.left.right = new TreeNodeC(4);
        root.right.right = new TreeNodeC(9);
        levelSum(root);
    }
    public static void levelSum(TreeNodeC root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return ;
        Queue<TreeNodeC> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int sum = 0;
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNodeC node = queue.poll();
                sum += node.val;
                if(node.left != null)
                {
                    queue.offer(node.left);
                }
                if(node.right != null)
                {
                    queue.offer(node.right);
                }
            }
            list.add(sum);
        }
        System.out.println(list);
    }
}
