class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int n = s.length(), l = 0,r = 0;
        int ans = 0;
        while(r<n){
            char ch = s.charAt(r);
            if(st.contains(ch)){
                while(l<r && s.charAt(l)!=ch)
                    st.remove(s.charAt(l++));
                l++;
            }
            else{
                st.add(ch);
                System.out.println(st);
                ans = Math.max(ans,st.size());
            }
            r++;
        }
        return ans;
    }
}
