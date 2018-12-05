import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/**
 * @Title: _103_Binary_Tree_Zigzag_Level_Order_Traversal
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/5 16:27
 * @Description:
 */

public class _103_Binary_Tree_Zigzag_Level_Order_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        ArrayDeque<TreeNode> d = new ArrayDeque<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        d.addFirst(root);
        tmp.add(root.val);
        int flag = 0;
        //list.add(new ArrayList<>(tmp));
        tmp.clear();
        int level = 1;
        while (!d.isEmpty()){
            TreeNode node = d.pollLast();
            tmp.add(node.val);
            level --;
            if (node.left != null){
                d.addFirst(node.left);
            }
            if (node.right != null){
                d.addFirst(node.right);
            }
            if (level == 0){
                if (flag == 0){
                    flag = 1;
                }
                else if (flag == 1){
                    Collections.reverse(tmp);
                    flag = 0;
                }
                list.add(new ArrayList<>(tmp));
                level = d.size();
                tmp.clear();
            }
        }
        return list;
    }
}
