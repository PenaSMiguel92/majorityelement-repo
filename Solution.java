import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) >= nums.length / 2) {
                return nums[i];
            } else {
                int val = !map.containsKey(nums[i]) ? 1 : map.get(nums[i]) + 1;
                map.put(nums[i], val);
            }
        }
        
        return 0;
    }
}
