class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxend = nums[0];
        int maxsum = nums[0];   // res1

        int minend = nums[0];
        int minsum = nums[0];   // res2

        int totalsum = nums[0];

        for(int i=1;i<nums.length;i++){

            totalsum += nums[i];
            
            //For max sum
            maxend = Math.max(nums[i],maxend + nums[i]);
            maxsum = Math.max(maxsum , maxend);

            //For min sum
            minend = Math.min(nums[i] , minend + nums[i]);
            minsum = Math.min(minsum , minend);
        }
        if(maxsum < 0){
                return maxsum;
        }
        return Math.max(maxsum , totalsum - minsum);
    }
}