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
    public TreeNode deleteNode(TreeNode root, int key) {
        // Phase-1
        if(root==null){
            return null;
        }
        if(root.val>key){
            root.left = deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        // PHASE-2
        else{
            // case 1
            if(root.left==null && root.right==null){
                return null;
            }
            // case 2
            else if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            // case 3
            else{
                TreeNode iS = inOrderSuccessor(root.right);
                root.val = iS.val;
                root.right = deleteNode(root.right,iS.val);
            }
        }
        return root;
    }
    public static TreeNode inOrderSuccessor(TreeNode root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
}

// IS - the node which replaces the node which is going to be delete is called Inorder Successor!
// BST NEVER DEAL WITH DUBLICATE DATA, But BINARY TREE MAY CONTAINS!
// First IS is Largest from the Left and Second IS is Smallest from the right! (when having Two child).
// No IS for Leaf Node!
// And for Single Child his Child is the only IS.