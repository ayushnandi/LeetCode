class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
        if (head.val == root.val && isNext(head, root)) {
            return true;
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean isNext(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null || head.val != root.val) return false;
        return isNext(head.next, root.left) || isNext(head.next, root.right);
    }
}
