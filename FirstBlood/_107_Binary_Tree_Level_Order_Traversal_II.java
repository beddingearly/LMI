/**
 * @Title: _107_Binary_Tree_Level_Order_Traversal_II
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/10 08:25
 * @Description:
 */
import java.util.*;
public class _107_Binary_Tree_Level_Order_Traversal_II {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayDeque<TreeNode> d = new ArrayDeque<>();
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        if (root == null){
            return lists;
        }
        d.addFirst(root);
        int length = d.size();
        while (!d.isEmpty()){
            TreeNode node = d.pollLast();
            tmp.add(node.val);
            length --;
            if (node.left != null){
                d.addFirst(node.left);
            }
            if (node.right != null){
                d.addFirst(node.right);
            }
            if (length == 0){
                lists.add(new ArrayList<>(tmp));
                length = d.size();
                tmp.clear();
            }
        }
        Collections.reverse(lists);
        return lists;
    }
}
