class KthLargest {
    PriorityQueue<Integer> minHeap;
    int size;
    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>( (a,b) -> a-b);
        size = k;
        for(int c:nums){
            minHeap.add(c);
            if(minHeap.size() > size)
                minHeap.poll();
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size() > size)
                minHeap.poll();
        return minHeap.peek();
    }
}
