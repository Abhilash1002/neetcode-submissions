class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int c:stones)
            maxHeap.add(c);
        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x == y) continue;
            maxHeap.add(x-y);
        }
        if(maxHeap.size() == 0)
            return 0;
        return maxHeap.poll();
    }
}
