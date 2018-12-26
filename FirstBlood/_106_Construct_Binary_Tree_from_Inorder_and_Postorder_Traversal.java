import java.util.Arrays;

/**
 * @Title: _106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/7 21:49
 * @Description:
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 *
 * 中序遍历 inorder = [9,3,15,20,7]
 * 后序遍历 postorder = [9,15,7,20,3]
 *
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class _106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    private class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){value = x;}
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        int left_in = getIndex(inorder, postorder[postorder.length-1])-1;
        int right_in = left_in + 2;

        int left_post = getIndex(postorder, inorder[left_in]);
        int right_post = left_post + 1;

        root.left = buildTree(Arrays.copyOfRange(inorder, 0, left_in + 1),
                Arrays.copyOfRange(postorder, 0, left_post + 1));

        root.right = buildTree(Arrays.copyOfRange(inorder, right_in, inorder.length),
                Arrays.copyOfRange(postorder, right_post, inorder.length-1));
        return root;
    }

    public int getIndex(int [] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (target == arr[i]){
                System.out.println("Yes");
                return i;
            }
        }
        System.out.println("No!");
        return -1;
    }
}
