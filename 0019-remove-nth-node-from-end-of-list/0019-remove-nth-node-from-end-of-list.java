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
class Solution {
    int i = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        head.next = removeNthFromEnd(head.next,n);
        i++;
        System.out.print(i);
        if(n==i){
            head = head.next;
        }
        // System.out.println("  "+head.val);
        return head;
    }
}