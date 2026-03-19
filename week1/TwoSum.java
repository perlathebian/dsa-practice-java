import java.util.*;

public class TwoSum {
    public static int[] naiveTwoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] hashmapTwoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        System.out.println(java.util.Arrays.toString(naiveTwoSum(nums, target)));
        System.out.println(java.util.Arrays.toString(hashmapTwoSum(nums, target)));
    }
}
