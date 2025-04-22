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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean lefttoRight = true;
        if(root==null){
            return result;
        }
        while (!q.isEmpty()) {
            TreeNode currNode = q.poll();
            if (currNode == null) {
                if(!lefttoRight){
                    Collections.reverse(level);
                }
                result.add(new ArrayList<>(level));
                level.clear();
                if (!q.isEmpty()) {
                    q.add(null);
                }
                lefttoRight = !lefttoRight; // toggling things in each level,
            } else {
                    level.add(currNode.val);
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }  

                }
            return result;
            }
        }