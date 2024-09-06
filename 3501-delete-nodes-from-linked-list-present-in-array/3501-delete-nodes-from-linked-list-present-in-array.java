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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        ListNode n1 = new ListNode(0);
        n1.next = head;
        ListNode n2 = n1;
        while(n2.next!=null){
            if(map.containsKey(n2.next.val)){
                n2.next = n2.next.next;
            }else{
                n2 = n2.next;
            }
        }
        return n1.next;
    }
}