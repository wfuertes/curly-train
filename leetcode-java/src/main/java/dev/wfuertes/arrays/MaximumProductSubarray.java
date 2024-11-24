package dev.wfuertes.arrays;

import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/maximum-product-subarray/description/
 * 
 * Given an integer array nums, find a subarray that has the largest product,
 * and return the product. The test cases are generated so that the answer will
 * fit in a 32-bit integer.
 * 
 * Example 1:
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * 
 * Example 2:
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 * 
 * Constraints:
 * 1 <= nums.length <= 2 * 104
 * -10 <= nums[i] <= 10
 * The product of any subarray of nums is guaranteed to fit in a 32-bit integer.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        return maxProductOn2(nums);
    }

    public int maxProductOn2(int[] nums) {
        var maxProduct = nums[0];

        for (var i = 0; i < nums.length; i++) {
            var currentProduct = 1;
            for (var j = i; j < nums.length; j++) {
                currentProduct *= nums[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }

        return maxProduct;
    }
}