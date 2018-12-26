/**
 * @Title: _104_Maximum_Depth_of_Binary_Tree
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/7 14:34
 * @Description:
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 */
public class _104_Maximum_Depth_of_Binary_Tree {
    private class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){value = x;}
    }
    public int maxDepth(TreeNode root) {
        int left;
        int right;
        if (root == null){
            return 0;
        }
        else {
            left = maxDepth(root.left) + 1;
            right = maxDepth(root.right) + 1;
        }
        return left > right ? left : right;
    }
}
