class Solution {
    public boolean checkIfValid(int[] cnt_s, int[] cnt_t){
        for(int i=0;i<cnt_s.length;i++){
            if(cnt_t[i] > cnt_s[i])
                return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int[] cnt_t = new int[128]; Arrays.fill(cnt_t,0);
        int[] cnt_s = new int[128]; Arrays.fill(cnt_s,0);
        for(char ch:t.toCharArray()){
            cnt_t[ch%128]++;
        }

        int n = s.length();
        int m = t.length();
        int l = 0, r = 0;
        int mn = 1000001;
        String ans = "";
        while(r < n){
            char ch = s.charAt(r);
            cnt_s[ch%128]++;
            while(l<=r && checkIfValid(cnt_s,cnt_t)){
                if(r-l+1 < mn){
                    ans = s.substring(l,r+1);
                    mn = r-l+1;
                }
                char tt = s.charAt(l);
                cnt_s[tt%128]--;
                l++;
            }
            r++;
        }
        return ans;
    }
}
