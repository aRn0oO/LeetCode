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
    int cap;
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    Map <Integer, Node> m = new HashMap<>();

    private void addNode(Node n){
        Node temp = head.next;

        head.next = n;//
        n.next = temp;
        
        temp.prev = n;
        n.prev = head;
    }

    private void delNode(Node n){
        Node prevv = n.prev;
        Node nextt = n.next;
        nextt. prev = prevv;
        prevv.next = nextt;
    }


    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            Node resNode =m.get(key);
            int res = resNode.val;
           
            delNode(resNode);
            m.remove(key);

            addNode(resNode);


            m.put(key, head.next);
            return res;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            Node curr = m.get(key);

            m.remove(key);
            delNode(curr);
        }
        if(m.size()== cap){
            m.remove(tail.prev.key);            
            delNode(tail.prev);

        }

        Node newNode = new Node (key, value);
        addNode(newNode);
        m.put(key, newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */