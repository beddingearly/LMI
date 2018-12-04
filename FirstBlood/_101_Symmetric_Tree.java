import java.util.ArrayDeque;

/**
 * @Title: _101_Symmetric_Tree
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/4 19:22
 * @Description:
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * 说明:
 *
 * 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
 */
public class _101_Symmetric_Tree {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }

    public TreeNode createTree(){
        TreeNode a = new TreeNode(1);
        a.right = new TreeNode(2);
        a.left = new TreeNode(2);
        a.left.left = new TreeNode(3);
        a.right.right = new TreeNode(3);
        a.left.right = new TreeNode(4);
        a.right.left = new TreeNode(4);
        return a;
    }
    // 递归操作
    public boolean isSymmetric1(TreeNode root) {
        if (root == null){
            return true;
        }
        else {
            if (check(root.left, root.right)){
                return true;
            }
            else {
                return false;
            }
        }
    }

    private boolean check(TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null){
            return true;
        }
        else if (node1 == null || node2 == null){
            return false;
        }
        return (node1.val == node2.val) && (check(node1.right, node2.left)) && (check(node1.left, node2.right));
    }

    //非递归操作
    public boolean isSymmetric(TreeNode root) {
        if ((root == null) || (root.left == null && root.right == null)){
            return true;
        }
        else if (root.left == null || root.right == null){
            return false;
        }
        else {
            ArrayDeque<TreeNode> d = new ArrayDeque<TreeNode>();
            d.addFirst(root.left);
            d.addLast(root.right);
            while (d.size() != 0){
                TreeNode leftnode = d.pollFirst();
                TreeNode rightnode = d.pollLast();
                if (leftnode == null && rightnode == null){
                    return true;
                }
                else if (leftnode == null || rightnode == null){
                    return false;
                }
                else if (leftnode.val != rightnode.val){
                    return false;
                }
                else {
                    if (rightnode.right != null && leftnode.left != null){
                        d.addLast(rightnode.right);
                        d.addFirst(leftnode.left);
                    }
                    else if (rightnode.right == null && leftnode.left == null){

                    }
                    else {
                        return false;
                    }
                    if (rightnode.left != null && leftnode.right != null){
                        d.addFirst(rightnode.left);
                        d.addLast(leftnode.right);
                    }
                    else if (rightnode.left == null && leftnode.right == null){

                    }
                    else {
                        return false;
                    }
                }
            }
            return true;
        }

    }
    public void test(){
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.addFirst(-1);
        a.addLast(1);

        System.out.println(a.pollFirst());
        System.out.println(a.pollFirst());
        System.out.println(a.pollFirst());
    }


    public static void main(String[] args) {
        _101_Symmetric_Tree a = new _101_Symmetric_Tree();
        TreeNode t = a.createTree();
        //a.test();
        System.out.println(a.isSymmetric(t));
    }
}
