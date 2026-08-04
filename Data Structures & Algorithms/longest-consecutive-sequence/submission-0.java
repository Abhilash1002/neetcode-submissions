class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int c:nums){
            st.add(c);
        }
        int ans = 0;
        for(int c:st){
            if(st.contains(c-1))
                continue;
            int cnt = 0, k = c;
            while(st.contains(k++))cnt++;
            ans = Math.max(ans,cnt);
        }
        return ans;

    }
}
