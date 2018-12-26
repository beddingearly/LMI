import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Title: _105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/7 14:58
 * @Description:
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 *
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class _105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    private class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){value = x;}
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder == null|| preorder == null || inorder.length == 0 || preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);

        int root_index = getIndex(inorder, preorder[0]);

        int left_in = root_index-1;
        int right_in = root_index + 1;

        if (left_in < 0){
            root.left = buildTree(null, null);

        }
        if (right_in > inorder.length-1){
            root.right = buildTree(null,null);
        }
        else {
            //int right_in = left_in + 2;
            int left_pre = getIndex(preorder, inorder[left_in]);
            int right_pre = left_pre + 1;

            root.left = buildTree(Arrays.copyOfRange(preorder, 1, left_pre + 1),
                    Arrays.copyOfRange(inorder, 0, left_in + 1));
            root.right = buildTree(Arrays.copyOfRange(preorder, right_pre, preorder.length),
                    Arrays.copyOfRange(inorder, right_in, inorder.length));
        }

        return root;
    }
    public int getIndex(int [] arr, int target){

        for (int i = 0; i < arr.length; i++){
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        _105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal a = new _105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();
        int [] pre = {-4,-10,3,-1,7,11,-8,2};
        int [] in = {-4,-1,3,-10,11,-8,2,7};
        a.buildTree(pre, in);

    }
}
