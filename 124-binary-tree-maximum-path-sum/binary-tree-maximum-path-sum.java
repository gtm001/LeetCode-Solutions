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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxHelp(root);
        return maxSum;
    }
    public int maxHelp(TreeNode root){
        int sum = 0;
        if(root==null){
            return 0;
        }
        // Recursively get max path sum from left and right
        int leftv = Math.max(0,maxHelp(root.left)); // discard negative paths
        int rightv = Math.max(0,maxHelp(root.right));

        // Check if current root makes a better path
        sum = root.val+leftv+rightv;
        maxSum = Math.max(maxSum,sum);

        // Return max path to parent (only one child can be taken in path)
        return root.val+Math.max(leftv,rightv);

    }
}