class Solution {
    public int maxSubArray(int[] nums) {
        int bestend = nums[0];
        int res = nums[0];

        for(int i=1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = bestend + nums[i];

            bestend = Math.max(v1,v2);
            res = Math.max(res,bestend);
        }
        return res;
    }
}