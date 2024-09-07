/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null) return false;
        if(head.val == root.val){
            if(isnext(head, root)){
                return true;
            }
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    public boolean isnext(ListNode head, TreeNode root){
        if(root == null ) return false;
        System.out.print(root.val+" ");
        if(head.val == root.val && head.next==null) return true;
        if(head.next==null) return false;
        if(head.val!=root.val) return false;
        System.out.print(root.val+" ");
        return isnext(head.next,root.left) || isnext(head.next,root.right);
    }
}