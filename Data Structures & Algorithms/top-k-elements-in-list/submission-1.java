class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int c: nums){
            mp.put(c,mp.getOrDefault(c,0) + 1);
        }
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a,b)->{
            return b.getValue() - a.getValue();
        });
        for(int c:mp.keySet()){
            pq.add(new Pair(c,mp.get(c)));
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.remove().getKey();
        }
        return ans;
    }
}
