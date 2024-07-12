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
    ArrayList <Integer> arr = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        helper(root);
        for(int i = 1 ; i < arr.size() ; i++ ){
            if(arr.get(i-1)>=arr.get(i))return false;
        }
        return true;
    }
    public ArrayList<Integer> helper(TreeNode root){
        if(root==null)return arr;
        helper(root.left);
        arr.add(root.val);
        helper(root.right);
        return arr;
    }
}