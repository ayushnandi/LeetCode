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
    public ListNode mergeNodes(ListNode head) {
        ListNode n1 = new ListNode(0);
        ListNode n2 = n1;
        int sum = 0 ;
        head = head.next;
        while(head!=null){
            if( head.val == 0 ){
                n1.next = new ListNode(sum);
                n1 = n1.next;
                sum = 0;
            }
            sum += head.val;
            head = head.next;
        }
        return n2.next;
    }
}