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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>(new valComparator());
        // for(ListNode list:lists){
        //     heap.add(list);
        //     list = list.next;
        // }

        int N = lists.length;
        for(int i = 0;i <N; i++){
            if(lists[i]!=null)heap.add(lists[i]);
        }
        if(heap.isEmpty()){return null;}
        ListNode ans = heap.poll();
        ListNode cur = ans;
        ListNode temp = ans; 
        if(temp.next!= null)heap.add(temp.next);
        while(!heap.isEmpty() ){
            temp = heap.poll();
            cur.next = temp;
            cur = cur.next;
            if(temp.next!= null)heap.add(temp.next);
        }
        

        return ans;

    }
    public class valComparator implements Comparator<ListNode>{
      
        public int compare(ListNode l1,ListNode l2){
            return l1.val-l2.val;
        }
    }
}