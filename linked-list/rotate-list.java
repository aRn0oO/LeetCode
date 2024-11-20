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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode tail = head;
        int length =1;
        while(tail.next!= null){//if tail != null, a null listnode may connect to headnode.
            tail = tail.next;
            length++;
        }
        
        tail.next =head;// circle listhere

        int steps = length- k%length;
        
        ListNode newTail = tail;
        while(steps>0){
            newTail = newTail.next;
            steps--;
        }
        ListNode res = newTail.next;
        
        newTail.next = null;
        return res;
    }
}