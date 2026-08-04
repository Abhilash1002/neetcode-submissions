class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int ans = 0;
        while(l<r){
            int area = Math.min(heights[l],heights[r]) * (r-l);
            ans = Math.max(area,ans);
            if(heights[l]>heights[r]) r--;
            else l++;
        }
        return ans;
    }
}
