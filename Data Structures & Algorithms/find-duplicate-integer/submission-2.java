class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int c = nums[i];
            if(i == c-1) 
                continue;
            if(nums[c-1] == c)
                return c;
            
            nums[i] = nums[c-1]; // swap numbers
            nums[c-1] = c;
            i--;
            // for(int ch:nums){
            //     System.out.print(ch+" ");
            // }
            // System.out.println("");
        }
        return 0;
    }
}
