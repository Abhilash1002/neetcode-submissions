class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums;

        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = nums[0];
        for(int i=1;i<n;i++){
            pref[i] = nums[i]*pref[i-1];
        }

        suff[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i] = nums[i]*suff[i+1];
        }

        for(int i=1;i<n-1;i++)
            nums[i] = pref[i-1] * suff[i+1];
        
        nums[0] = suff[1];
        nums[n-1] = pref[n-2];
        
        return nums;
    }
}

//  1,2,4,6
//  pre - 1, 2, 8, 48
//  suf - 48,48,24,6