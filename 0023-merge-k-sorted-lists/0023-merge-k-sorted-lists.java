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
    public ListNode mergeKLists(ListNode[] arr) {
        int k = arr.length;
        if(k == 1){
            return arr[0];
        }
        else if(k == 0){
            return null;
        }
        
        // return arr[0];
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0 ; i < k ; i++ ){
            ListNode n1 = arr[i];
            while(n1!=null){
                array.add(n1.val);
                n1 = n1.next;
            }
        }
        Collections.sort(array);
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        
        for (int val : array) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;
    }
}