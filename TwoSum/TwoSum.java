import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap= new HashMap<>();

        for(int i=0; i< nums.length; i++){
            int complement= target - nums[i];

            if(sumMap.containsKey(complement)){
                return new int[]{i, sumMap.get(complement)};
            }
            sumMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
