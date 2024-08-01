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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr  = new ArrayList<>();
        ListNode n = head;
        while(n!=null){
            arr.add(n.val);
            n = n.next;
        }
        Collections.sort(arr);
        ListNode n1 = head;
        for(int i : arr){
            n1.val = i;
            n1 = n1.next; 
        }
        return head;
    }
}