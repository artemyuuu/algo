package SlidingWindow;

import org.example.SlidingWindow.MinimumSizeSubarraySum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumSizeSubarraySumTest {

    @Test
    void testExample1() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int expected = 2;

        Assertions.assertEquals(expected,
                MinimumSizeSubarraySum.minSubArrayLen(target, nums));
    }

    @Test
    void testExample2() {
        int[] nums = {1, 4, 4};
        int target = 4;
        int expected = 1;

        Assertions.assertEquals(expected,
                MinimumSizeSubarraySum.minSubArrayLen(target, nums));
    }

    @Test
    void testExample3() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        int expected = 0;

        Assertions.assertEquals(expected,
                MinimumSizeSubarraySum.minSubArrayLen(target, nums));
    }

    @Test
    void testEdgeEmptyArray() {
        int[] nums = {};
        int target = 10;
        int expected = 0;

        Assertions.assertEquals(expected,
                MinimumSizeSubarraySum.minSubArrayLen(target, nums));
    }
}
