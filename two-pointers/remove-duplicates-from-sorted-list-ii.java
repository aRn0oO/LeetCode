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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        dummy.next = head;
        ListNode prev = dummy.next;
        ListNode curr = dummy.next.next;
        while(curr != null){
            if(curr.val == prev.val){
                prev.next = curr.next;
            }else prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}