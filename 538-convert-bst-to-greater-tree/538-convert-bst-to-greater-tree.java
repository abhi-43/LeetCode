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
// Recursive Way - Reverse Inorder Traversal Time and Space - O(N)
class Solution {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        
        if(root == null)
            return null;
           
        convertBST(root.right);
        sum+=root.val;
        root.val = sum;
        convertBST(root.left);
        
        return root;
    }
}

// Iterative Way - O(N)
// Follow up - Solve in O(1)
