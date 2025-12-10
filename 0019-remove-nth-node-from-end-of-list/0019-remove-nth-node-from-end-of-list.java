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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode list = dummy;
        ListNode l2 = dummy;
        
        for(int i = 0 ; i <= n ; i++ ){
            list = list.next;
        }
        while(list != null){
            list = list.next;
            l2= l2.next;
            // System.out.println(l2.val);
        }
        l2.next = l2.next.next;
        return dummy.next;

    }
}