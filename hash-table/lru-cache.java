class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int cap;
    Map<Integer, Node> m = new HashMap<>();

    private void addNode(Node newnode){
        Node temp = head.next;//store next node from head
        
        newnode.next = temp;
        newnode.prev = head;

        head.next = newnode;
        temp.prev = newnode;
    }

    private void delNode(Node delnode){
        Node prevv = delnode.prev;
        Node nextt = delnode.next;

        prevv.next = nextt;
        nextt.prev = prevv;
    }


    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head; //remember to connect head &tail
        
    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            Node resNode = m.get(key);
            int ans = resNode.val;

            m.remove(key);
            delNode(resNode);
            addNode(resNode);

            m.put(key, head.next);
            return ans;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            Node cur = m.get(key);
            m.remove(key);
            delNode(cur);
            
        }
        if(m.size() == cap){
            m.remove(tail.prev.key);
            delNode(tail.prev);
        }
         
        addNode(new Node(key,value));
        m.put(key, head.next);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */