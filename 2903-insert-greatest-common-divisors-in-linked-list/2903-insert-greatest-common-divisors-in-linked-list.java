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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr.next!=null){
            int a  = curr.val;
            int b = curr.next.val;
            int v = gcd(a,b);
            ListNode temp = curr.next;
            ListNode node = new ListNode(v);
            curr.next = node;
            node.next = temp;
            curr = temp;
        }
        return head;
    }
    public int gcd(int a, int b){
        if(b>a){
            int temp = a;
            a=b;
            b=temp;
        }
        int r;
        while (b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}