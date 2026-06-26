import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> map = new Hashtable<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }

        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            int a = target - nums[i];
            if(map.containsKey(a) && map.get(a)!=i){
                ans[0] = map.get(a);
                ans[1] = i;
                return ans;
            }
        }
        return new int[0];    
    }
}