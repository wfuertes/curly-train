package dev.wfuertes.arrays;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

    @Test
    void testContainsDuplicate_withDuplicates() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = { 1, 2, 3, 1 };
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isTrue();
    }

    @Test
    void testContainsDuplicate_withoutDuplicates() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = { 1, 2, 3, 4 };
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isFalse();
    }

    @Test
    void testContainsDuplicate_withMultipleDuplicates() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isTrue();
    }

    @Test
    void testContainsDuplicate_withSingleElement() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = { 1 };
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isFalse();
    }

    @Test
    void testContainsDuplicate_withEmptyArray() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {};
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isFalse();
    }
}