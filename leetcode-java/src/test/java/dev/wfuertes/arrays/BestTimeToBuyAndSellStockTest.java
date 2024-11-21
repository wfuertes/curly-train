package dev.wfuertes.arrays;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockTest {

    @Test
    void testMaxProfit() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        assertThat(solution.maxProfitOn2(new int[] { 7, 1, 5, 3, 6, 4 })).isEqualTo(5);
        assertThat(solution.maxProfitOn2(new int[] { 7, 6, 4, 3, 1 })).isZero();
        assertThat(solution.maxProfitOn2(new int[] { 1, 2, 3, 4, 5 })).isEqualTo(4);
        assertThat(solution.maxProfitOn2(new int[] { 5, 4, 3, 2, 1 })).isZero();
        assertThat(solution.maxProfitOn2(new int[] { 2, 4, 1 })).isEqualTo(2);
    }


    @Test
    void testMaxProfitOn() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        assertThat(solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 })).isEqualTo(5);
        assertThat(solution.maxProfit(new int[] { 7, 6, 4, 3, 1 })).isZero();
        assertThat(solution.maxProfit(new int[] { 1, 2, 3, 4, 5 })).isEqualTo(4);
        assertThat(solution.maxProfit(new int[] { 5, 4, 3, 2, 1 })).isZero();
        assertThat(solution.maxProfit(new int[] { 2, 4, 1 })).isEqualTo(2);
    }
}