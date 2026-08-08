class Solution {
    public boolean isPure(int[] arr, int k) {
        int mx = 0, sum = 0;
        for (int c : arr) {
            sum += c;
            mx = Math.max(c, mx);
        }
        return k  >= (sum - mx);
    }
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] cnt = new int[32];
        Arrays.fill(cnt, 0);

        int l = 0, r = 0;
        int ans = 1;
        while (r < n) {
            char ch = s.charAt(r);
            cnt[ch%32]++;
            if(isPure(cnt,k)){
                ans = Math.max(ans,r-l+1);
            }else{
                while(l<=r && !isPure(cnt,k)){
                    char t = s.charAt(l);
                    cnt[t%32]--;
                    l++;
                }
            }
            r++;
        }
        return ans;
    }
}
