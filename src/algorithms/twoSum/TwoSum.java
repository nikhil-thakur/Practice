package algorithms.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int index;
        Map<Integer, Integer> dictionary = new HashMap<>();
        for (index = 0; index < nums.length; index++){
            if(dictionary.containsKey(target-nums[index])){
                result[1] = index;
                result[0] = dictionary.get(target-nums[index]);
                break;
            }
            else dictionary.put(nums[index], index);
        }
        return result;
    }
}
