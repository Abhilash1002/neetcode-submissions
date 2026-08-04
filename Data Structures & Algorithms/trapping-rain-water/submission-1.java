class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] rightMax = new int[n];

        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int ans = 0;
        int maxTillNow = height[0];
        for(int i=1;i<n-1;i++){
            maxTillNow = Math.max(height[i],maxTillNow);
            ans += Math.min(maxTillNow,rightMax[i]) - height[i] ;
        }
        return ans;
    }
}
