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
    public int getDecimalValue(ListNode head) {
        List<Integer> list= new ArrayList<>();
        int res = 0;

        while(head!= null){
            list.add(head.val);
            head = head.next;
        }
        int digit=1;
        for(int i = list.size()-1; i >=0 ;i--){
            if(list.get(i)==1){
                res += digit;
            } 
            digit= digit<<1;
        }

        return res;
    }
}