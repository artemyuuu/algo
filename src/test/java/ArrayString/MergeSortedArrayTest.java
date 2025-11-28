package ArrayString;

import org.example.ArrayString.MergeSortedArray1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    @Test
    void example1_fromDescription() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        MergeSortedArray1 solution = new MergeSortedArray1();
        solution.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void example2_fromDescription() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        MergeSortedArray1 solution = new MergeSortedArray1();
        solution.merge(nums1, m, nums2, n);

        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void example3_fromDescription() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        MergeSortedArray1 solution = new MergeSortedArray1();
        solution.merge(nums1, m, nums2, n);

        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void allElementsFromNums2ComeFirst() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        MergeSortedArray1 solution = new MergeSortedArray1();
        solution.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void nums2AllGreaterThanNums1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {4, 5, 6};
        int n = 3;

        MergeSortedArray1 solution = new MergeSortedArray1();
        solution.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void duplicatedValuesMixed() {
        int[] nums1 = {1, 2, 2, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 2, 3};
        int n = 3;

        MergeSortedArray1 solution = new MergeSortedArray1();
        solution.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 2, 2, 2, 3};
        assertArrayEquals(expected, nums1);
    }
}
