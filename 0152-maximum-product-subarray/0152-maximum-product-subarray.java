class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int newMax = nums[0];
        int newMin = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            int localMax = newMax;
            int localMin = newMin;
            newMax = Math.max(nums[i],Math.max(localMax*nums[i],localMin*nums[i]));
            newMin = Math.min(nums[i],Math.min(localMin*nums[i],localMax*nums[i]));
            max = Math.max(newMax,max);
        }
        return max;
    }
}