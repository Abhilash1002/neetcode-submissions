class Solution {
    public boolean check(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] cnt1 = new int[32]; Arrays.fill(cnt1,0);
        int[] cnt2 = new int[32]; Arrays.fill(cnt2,0);
        for(char c:s1.toCharArray()){
            cnt1[c%32]++;
        }
        int x = s1.length() , y = s2.length();
        int l = 0, r = 0;
        while(r < y){
            cnt2[s2.charAt(r)%32]++;
            if( check(cnt1,cnt2) )
                return true;
            while(r-l+1 >= x){
                cnt2[s2.charAt(l)%32]--;
                l++;
            }
            r++;
        }
        return false;
    }
}
