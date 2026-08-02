
package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P0001_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
    public static void main(String[] args) {
        P0001_TwoSum solution = new P0001_TwoSum();

        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        System.out.println("Test 1 Result: " + Arrays.toString(solution.twoSum(nums1, target1)) + " (Expected: [0, 1])");

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        System.out.println("Test 2 Result: " + Arrays.toString(solution.twoSum(nums2, target2)) + " (Expected: [1, 2])");
    }
}
