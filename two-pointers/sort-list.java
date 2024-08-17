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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = findMid(head);
        ListNode first = head;
        ListNode second = mid.next;
        mid.next = null;
        return merge(sortList(first), sortList(second));
    }
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode dum = new ListNode(0);
        ListNode cur = dum;
        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                cur.next = l1;
                l1 = l1.next;
    
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur =cur.next;
        }
        cur .next= l1==null? l2:l1;
        return dum.next;
    }

    private ListNode findMid(ListNode head){
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode s = dum;
        ListNode f = dum;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}