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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next ==null)return head;
        ListNode dummy = new ListNode(0);
        dummy.next  = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur!=null&&cur.next != null){
           ListNode first  = cur;
           ListNode second= cur.next;
           pre.next = second;
           first.next = second.next;
           second.next = first;
           pre = first;
           cur = first.next;
        }
        return dummy.next;
    }
}