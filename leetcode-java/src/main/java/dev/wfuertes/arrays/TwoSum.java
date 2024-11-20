package dev.wfuertes.arrays;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/two-sum/
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
*/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (var i = 0; i < nums.length; i++) {
            var diff = target - nums[i];
            var diffIndex = map.get(diff);

            if (diffIndex == null) {
                map.put(nums[i], i);
            } else {
                return new int[] { i, diffIndex };
            }
        }

        throw new IllegalStateException();
    }
}
