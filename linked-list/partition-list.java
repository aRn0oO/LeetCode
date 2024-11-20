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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy; 
        ListNode sec = new ListNode(0);
        ListNode secTail = sec;
        while(head!= null){
            if(head.val< x){
                tail.next = head;
                tail = tail.next;
            }else{
                secTail.next = head;
                secTail = secTail.next;
            }
            head = head.next;
        }
        secTail.next = null;// terminate the greater list
        tail.next = sec.next;

        return dummy.next;
    }
}