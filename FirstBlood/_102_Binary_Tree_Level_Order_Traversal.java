/**
 * @Title: _102_Binary_Tree_Level_Order_Traversal
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/5 14:54
 * @Description:
 */
import java.util.*;
public class _102_Binary_Tree_Level_Order_Traversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public TreeNode createTree(){
        TreeNode a = new TreeNode(3);
        a.right = new TreeNode(20);
        a.left = new TreeNode(9);
        //a.left.left = new TreeNode(3);
        a.right.right = new TreeNode(7);
        //a.left.right = new TreeNode(4);
        a.right.left = new TreeNode(15);
        return a;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        ArrayDeque<TreeNode> d = new ArrayDeque<>();
        tmp.add(root.val);
        list.add(new ArrayList<>(tmp));
        tmp.clear();
        if (root.left != null){
            d.addFirst(root.left);
        }
        if (root.right != null){
            d.addFirst(root.right);
        }
        int level = d.size();
        list.add(tmp);
        while (!d.isEmpty()){
            TreeNode node = d.pollLast();
            tmp.add(node.val);
            level--;
            if (node.left != null){
                d.addFirst(node.left);
            }
            if (node.right != null){
                d.addFirst(node.right);
            }
            if (level == 0){
                if (!tmp.isEmpty())
                    list.add(new ArrayList<>(tmp));
                level = d.size();
                tmp.clear();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        _102_Binary_Tree_Level_Order_Traversal a = new _102_Binary_Tree_Level_Order_Traversal();
        TreeNode t = a.createTree();
        for (List i: a.levelOrder(t)){
            for (Object j: i){
                System.out.println(j);
            }
        }

    }
}
