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
    int small = -1;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        hkthSmall(root,k);
        return small;
    }
    public void hkthSmall(TreeNode root,int k){
        if(root==null){
            return;
        }
        hkthSmall(root.left,k);
        count++;
        if(count==k){
            small = root.val;
            return;
        }
        hkthSmall(root.right,k);
    } 
}