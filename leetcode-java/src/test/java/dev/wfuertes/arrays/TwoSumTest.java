package dev.wfuertes.arrays;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void testTwoSum() {
        TwoSum twoSum = new TwoSum();

        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = twoSum.twoSum(nums1, target1);
        assertThat(result1).containsExactlyInAnyOrder(0, 1);

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = twoSum.twoSum(nums2, target2);
        assertThat(result2).containsExactlyInAnyOrder(1, 2);

        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] result3 = twoSum.twoSum(nums3, target3);
        assertThat(result3).containsExactlyInAnyOrder(0, 1);
    }
}