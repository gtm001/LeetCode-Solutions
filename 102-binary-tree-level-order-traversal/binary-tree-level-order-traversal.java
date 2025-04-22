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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> list = new LinkedList<>();
        list.add(root);
        list.add(null);
        List<Integer> level = new ArrayList<>();
        while(!list.isEmpty()){
            TreeNode currNode = list.remove();
            if(currNode==null){
                result.add(new ArrayList<>(level));
                level.clear();
                if(!list.isEmpty()){
                    list.add(null);
                }
            }
            else{
                level.add(currNode.val);
                if(currNode.left!=null){
                    list.add(currNode.left);
                }
                if(currNode.right!=null){
                    list.add(currNode.right);
                }
            }
        }
        return result;
    }
}