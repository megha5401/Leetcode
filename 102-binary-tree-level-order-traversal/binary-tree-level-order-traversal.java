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
    //megha0
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if( root == null )
            return ans;
        func( root , 1 , ans );
        return ans;
    }
    private void func( TreeNode root , int k , List<List<Integer>> ans ) {
        if( root == null ) return;
        if( k > ans.size() ) {
            List<Integer> kk = new ArrayList<>();
            ans.add(kk);
        }
        ans.get(k - 1).add(root.val);
        func( root.left , k + 1 , ans );
        func( root.right ,  k + 1 , ans );
    }
}