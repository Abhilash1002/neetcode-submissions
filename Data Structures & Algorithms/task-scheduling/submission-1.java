class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] cnt = new int[26];
        int mx = 0;
        for(char ch:tasks){
            cnt[ch-'A']++;
            mx = Math.max(mx,cnt[ch-'A']);
        }
        int mx_cnt = 0;
        for(int c:cnt){
            if(c == mx)
                mx_cnt++;
        }
        int t = mx*mx_cnt + (mx-1)*(n-mx_cnt+1);
        return Math.max(tasks.length, t);
    }
}
