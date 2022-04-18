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

// class Solution {
//     public int kthSmallest(TreeNode root, int k) {
//         List<Integer> ans = new ArrayList<>();
//         if(root == null)
//             return 0;
        
//         ans = dfs(root);
//         return ans.get(k-1);
        
//     }
//     public List<Integer> dfs(TreeNode root)
//     {
//         List<Integer> ans = new ArrayList<>();
//         if(root == null)
//             return new ArrayList<>();
        
//         ans.addAll(dfs(root.left));
//         ans.add(root.val);
//          ans.addAll(dfs(root.right));
        
//         return ans;
//     }
// }

class Solution{
    int result = -1;
    int count = 0;
    public int kthSmallest(TreeNode root, int k)
    {
        if(root == null)
            return 0;
        
        dfs(root, k);
        return result;
    }
    public void dfs(TreeNode root, int k)
    {
        if(root==null)
            return;
        
        dfs(root.left, k);
        count++;
        if(count == k)
            result = root.val;
        dfs(root.right, k);
  
    }
}