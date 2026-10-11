/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int findheight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = findheight(root.left);
        int right = findheight(root.right);

        return 1 + Math.max(left, right);
    }



    public boolean isBalanced(TreeNode root) {


        if(root==null){
            return true;
        }

        int h1=findheight(root.left);
        int h2=findheight(root.right);

        if(Math.abs(h1-h2)>1){
            return false;
        }   

        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);

        if(!left || !right){
            return false;
        }
        return true;
    }
}