package dev.wfuertes.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

    @Test
    void testProductExceptSelf_case1() {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = { 1, 2, 3, 4 };
        int[] expected = { 24, 12, 8, 6 };
        int[] result = solution.productExceptSelf(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testProductExceptSelf_case2() {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = { -1, 1, 0, -3, 3 };
        int[] expected = { 0, 0, 9, 0, 0 };
        int[] result = solution.productExceptSelf(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testProductExceptSelf_singleElement() {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = { 1 };
        int[] expected = { 1 };
        int[] result = solution.productExceptSelf(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testProductExceptSelf_allZeros() {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = { 0, 0, 0, 0 };
        int[] expected = { 0, 0, 0, 0 };
        int[] result = solution.productExceptSelf(nums);
        assertThat(result).isEqualTo(expected);
    }
}