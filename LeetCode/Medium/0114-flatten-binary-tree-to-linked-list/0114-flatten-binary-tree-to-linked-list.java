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

    Queue<TreeNode> q=new LinkedList<>();

   void preorder(TreeNode root ){

    if(root==null){
        return;
    }

        q.offer(root);
        preorder(root.left);
        preorder(root.right);

    }
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        preorder(root);
       
       while(!q.isEmpty()){

        TreeNode curr=q.poll();
        curr.left=null;


            if (!q.isEmpty()) {
                curr.right = q.peek();
            } else {
                curr.right = null;
            }

       }

        
    }
}