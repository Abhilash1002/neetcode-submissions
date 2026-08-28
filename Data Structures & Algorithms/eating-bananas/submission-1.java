class Solution {
    public boolean canEat(int[] piles, int nanas,int hours){
        for(int c:piles){
            hours -= c/nanas;
            if(c%nanas != 0) hours--;
        }
        return hours >= 0;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int sum = 0;
        for(int c:piles)
            sum = Math.max(sum,c);
        int l = 1, r = sum;
        int ans = sum;
        while(l<=r){
            int mid = (r-l)/2 + l;
            if(canEat(piles,mid,h)){
                ans = Math.min(ans,mid);
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        } 
        return ans;
    }
}
