class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int l = 0, r = n-1;
        int maxLeft = height[l], maxRight = height[r];

        while(l<r){
            if(height[l] < height[r]){
                ans += Math.min(maxLeft,maxRight) - height[l++];
            }else{
                ans += Math.min(maxLeft,maxRight) - height[r--];
            }
            maxLeft = Math.max(maxLeft,height[l]);
            maxRight = Math.max(maxRight,height[r]);
        }

        return ans;
    }
}
