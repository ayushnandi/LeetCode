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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode list = head.next;
        int index = 2;
        ArrayList<Integer> arr = new ArrayList<>();
        while (list.next != null) {
            System.out.print(list.val + " -> ");
            if ((list.val > prev.val && list.val > list.next.val) || 
                (list.val < prev.val && list.val < list.next.val)) {
                arr.add(index);
            }
            prev = list;
            list = list.next;
            index++;
        }
        int [] arr2 = new int [2];
        arr2[0] =-1 ;
        arr2[1] =-1 ;
        if(arr.size()<2){
            return arr2;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.size() ;i++){
            min = Math.min(arr.get(i)-arr.get(i-1),min);
        }
        int max = arr.get(arr.size()-1)-arr.get(0);
        arr2[0] = min;
        arr2[1] = max;
        return arr2;
    }
}