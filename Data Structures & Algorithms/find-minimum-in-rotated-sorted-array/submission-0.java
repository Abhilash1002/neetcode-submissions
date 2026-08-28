class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (r-l)/2 + l;
            // System.out.println("L:"+ nums[l] +" r:" + nums[r] + " mid: " + nums[mid]);
            ans = Math.min(ans,nums[mid]);
            if(nums[mid] > nums[r]){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }
}
