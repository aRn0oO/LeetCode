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
    public ListNode reverseKGroup(ListNode head, int k) {
   
        ListNode dummy = new ListNode(0,head );
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode back  = dummy;

        
        while(true){
        
            for(int i = 0;i<k; i++) {
                if(back == null || back.next==null) return dummy.next;
                back = back.next;
            }
            while(cur != back){
                pre.next = cur.next;
                cur.next = back.next;
                back.next = cur;
                cur = pre.next;       
                               
            }
            back = head;
            head = back.next;
            pre = back;
            cur= pre.next;

            
            
        }
       
    }
}