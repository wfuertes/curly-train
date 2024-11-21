package dev.wfuertes.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/description/
 * 
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer.
 * You must write an algorithm that runs in O(n) time and without using the
 * division operation.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * 
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 * 
 * Constraints:
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer.
 * 
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The
 * output array does not count as extra space for space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        // [0,1,2,3] -> indexes
        // [1,2,3,4]
        // a[0] = 2.3.4 = 24 -> a[1].a[2].a[3]
        // a[1] = 1.3.4 = 12 -> a[0].a[2].a[3]
        // a[2] = 1.2.4 = 8 --> a[0].a[1].a[3]
        // a[3] = 1.2.3 = 6 --> a[0].a[1].a[2]

        // [0,1,2,3,4,5]
        // [-1,1,0,-3,3]
        // a[0] = a[1].a[2].a[3].a[4].a[5]
        // a[1] = a[0].a[2].a[3].a[4].a[5]
        // a[2] = a[0].a[1].a[3].a[4].a[5]

        return productExceptSelfOn2(nums);
    }

    public int[] productExceptSelfOn(int[] nums) {
        final var answer = new int[nums.length];

        // Step 1: calculate prefix product
        answer[0] = 1;
        for (var i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate suffix product and final result
        int suffixProduct = 1;
        for (var i = nums.length - 1; i >= 0; i--) {
            answer[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return answer;
    }

    public int[] productExceptSelfOn2(int[] nums) {
        final var lastIndex = nums.length - 1;
        final var answer = new int[nums.length];
        Arrays.fill(answer, 1);

        for (var i = 0; i < nums.length; i++) {
            var count = 0;
            var k = i == lastIndex ? 0 : i + 1;

            while (count < lastIndex) {
                answer[i] *= nums[k];

                if (k >= lastIndex) {
                    k = 0;
                } else {
                    k++;
                }
                count++;
            }
        }

        return answer;
    }
}
