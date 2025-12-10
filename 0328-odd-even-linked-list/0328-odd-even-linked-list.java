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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode even = new ListNode();
        ListNode ans1 = even;
        ListNode odd = new ListNode();
        ListNode ans = odd;
        while(head!=null && head.next != null ){
            odd.next = new ListNode(head.val);
            even.next = new ListNode(head.next.val);
            odd = odd.next;
            even = even.next;
            head = head.next.next;
        }
        if(head!=null){
            // System.out.println("here"+head.val);
            odd.next = new ListNode(head.val);
            odd = odd.next;
        }
        odd.next = ans1.next;
        return ans.next;
    }
}