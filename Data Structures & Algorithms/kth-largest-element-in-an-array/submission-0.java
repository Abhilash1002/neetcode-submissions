class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> a-b);
        for(int c:nums){
            minHeap.add(c);
            if(minHeap.size() > k)
                minHeap.poll();
        }
        return minHeap.poll();
    }
}
