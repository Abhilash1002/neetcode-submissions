class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->  b[0]-a[0]);
        int n = nums.length;
        for(int i=0;i<k;i++) 
            pq.offer(new int[]{nums[i],i});
        
        int[] ans = new int[n-k+1];
        ans[0] = pq.peek()[0];
        for(int i=k;i<n;i++){
            pq.offer(new int[]{nums[i],i});
            while(pq.peek()[1] < (i-k+1))
                pq.poll();
            int[] mx = pq.peek();
            ans[i-k+1] = mx[0];
        }

        return ans;
    }
}
