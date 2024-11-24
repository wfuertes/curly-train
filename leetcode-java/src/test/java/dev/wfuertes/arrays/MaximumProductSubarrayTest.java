package dev.wfuertes.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;


class MaximumProductSubarrayTest {

    @Test
    void testMaxProduct() {
        MaximumProductSubarray solution = new MaximumProductSubarray();

        assertThat(solution.maxProduct(new int[]{2, 3, -2, 4})).isEqualTo(6);
        assertThat(solution.maxProduct(new int[]{-2, 0, -1})).isZero();
        assertThat(solution.maxProduct(new int[]{-2, 3, -4})).isEqualTo(24);
        assertThat(solution.maxProduct(new int[]{0, 2})).isEqualTo(2);
        assertThat(solution.maxProduct(new int[]{-2, -3, 7})).isEqualTo(42);
    }

    @Test
    void testMaxProductOn2() {
        MaximumProductSubarray solution = new MaximumProductSubarray();

        assertThat(solution.maxProductOn2(new int[]{2, 3, -2, 4})).isEqualTo(6);
        assertThat(solution.maxProductOn2(new int[]{-2, 0, -1})).isZero();
        assertThat(solution.maxProductOn2(new int[]{-2, 3, -4})).isEqualTo(24);
        assertThat(solution.maxProductOn2(new int[]{0, 2})).isEqualTo(2);
        assertThat(solution.maxProductOn2(new int[]{-2, -3, 7})).isEqualTo(42);
    }
}