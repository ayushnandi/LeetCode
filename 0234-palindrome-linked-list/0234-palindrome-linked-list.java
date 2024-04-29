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
    public boolean isPalindrome(ListNode head){
        ArrayList<Integer> arr = new ArrayList<>();
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        int n = arr.size() -1;
        for(int i = 0 ; i <= n ; n--, i++){
            if(!arr.get(i).equals(arr.get(n))){
                return false;
            }
        }
        return true;
    }
}
