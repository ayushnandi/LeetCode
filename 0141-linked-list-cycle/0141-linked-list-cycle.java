/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    HashMap<ListNode,Integer> map = new HashMap<>();
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        if(map.containsKey(head))return true;
        else map.put(head,0);
        return hasCycle(head.next);
    }
}