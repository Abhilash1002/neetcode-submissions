class Node{
    public Node prev,next;
    public int key;
    public int value;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}
class LRUCache {
    public Node head,tail;
    public HashMap<Integer,Node> mp;
    public int maxCapacity, currCapacity;
    public LRUCache(int capacity) {
        mp = new HashMap<>();
        this.head = new Node(-1,-1);
        this.tail = new Node(-1,-1);
        this.head.next = tail;
        this.tail.prev = head;
        this.maxCapacity = capacity;
        this.currCapacity = 0;
    }
    public void printDLL(){
        Node temp = head;
        while(temp!=null){
            // System.out.print(temp.key + " ");
            temp = temp.next;
        }
        // System.out.println("  ------");
    }
    public int get(int key) {
        // System.out.println("GET:" + key);
        if(!mp.containsKey(key))
            return -1;
        Node k = deleteNode(mp.get(key));
        addToTail(k);
        printDLL();
        return k.value;      
    }
    
    public void put(int key, int value) {
        // System.out.println("PUT:" + key);
        if(mp.containsKey(key)){
            // System.out.println("key present:" + key);
            Node k = deleteNode(mp.get(key));
            k.value = value;
            addToTail(k);
        }else{
            // System.out.println("key absent:" + key);
            currCapacity++;
            if(currCapacity > maxCapacity){
                // System.out.println("curr capacity:"+ currCapacity +" exceeds max capacity :" + maxCapacity);
                mp.remove(head.next.key);
                deleteNode(head.next);
                currCapacity--;
            }
            Node newNode = new Node(key,value);
            mp.put(key, newNode);
            addToTail(newNode);
        }
        printDLL();
    }
    public void addToTail(Node newNode){
        tail.prev.next = newNode;
        newNode.prev = tail.prev;
        tail.prev = newNode;
        newNode.next = tail;
    }
    public Node deleteNode(Node node){
        Node left = node.prev,right = node.next;
        left.next = right;
        right.prev = left;
        return node;
    }
}
