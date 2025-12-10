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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode();
        ListNode ans = list;
        int carry = 0;
        while(l1!=null || l2!=null){
            int n1 = 0 , n2 = 0;
            if(l1!=null)n1 = l1.val;
            if(l2!=null)n2 = l2.val;
            ListNode ls = new ListNode((n2+n1+carry)%10);
            list.next = ls;
            list = list.next;
            carry = n1+n2+carry>9 ? 1 : 0;
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
        }
        if(carry==1)list.next = new ListNode(1);
        return ans.next;
    }
}