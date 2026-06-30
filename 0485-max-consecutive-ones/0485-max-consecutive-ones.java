class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int res = 0;
      int max = 0;
      for(int i=0;i<nums.length;i++){
        if(nums[i] == 1){
            max++;
            res = Math.max(res,max);
        }
        if(nums[i] == 0){
            max = 0;
        }
      }
      return res;
    }
}