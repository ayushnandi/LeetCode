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
    int prev = 0;
    public boolean isValidBST(TreeNode root) {
        // if(root == null)return true;
        // if(prev >= root.val)return false;
        // System.out.println(root.val);
        // prev = root.val;
        // return isValidBST(root.left) && isValidBST(root.right);
        ArrayList <Integer> arr = new ArrayList<>();
        helper(root, arr);
        for(int i = 1 ; i < arr.size() ; i++ ){
            if(arr.get(i-1)>=arr.get(i))return false;
        }
        return true;
    }
    public ArrayList<Integer> helper(TreeNode root ,ArrayList<Integer> arr){
        if(root==null)return arr;
        helper(root.left , arr);
        arr.add(root.val);
        helper(root.right , arr);
        return arr;
    }
}