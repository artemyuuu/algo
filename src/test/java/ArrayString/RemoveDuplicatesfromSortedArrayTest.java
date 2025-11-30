package ArrayString;


import org.example.ArrayString.RemoveDuplicatesfromSortedArray3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesfromSortedArray3Test {
    @Test
    void example1() {
        int[] nums = {1, 1, 2};

        RemoveDuplicatesfromSortedArray3 sol = new RemoveDuplicatesfromSortedArray3();
        int k = sol.removeDuplicates(nums);

        assertEquals(2, k, "k must be 2");
        assertArrayEquals(new int[]{1, 2}, extract(nums, k));
    }

    @Test
    void example2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        RemoveDuplicatesfromSortedArray3 sol = new RemoveDuplicatesfromSortedArray3();
        int k = sol.removeDuplicates(nums);

        assertEquals(5, k);
        assertArrayEquals(new int[]{0,1,2,3,4}, extract(nums, k));
    }

    @Test
    void noDuplicates() {
        int[] nums = {1, 2, 3};

        RemoveDuplicatesfromSortedArray3 sol = new RemoveDuplicatesfromSortedArray3();
        int k = sol.removeDuplicates(nums);

        assertEquals(3, k);
        assertArrayEquals(new int[]{1,2,3}, extract(nums, k));
    }

    @Test
    void allSame() {
        int[] nums = {5,5,5,5};

        RemoveDuplicatesfromSortedArray3 sol = new RemoveDuplicatesfromSortedArray3();
        int k = sol.removeDuplicates(nums);

        assertEquals(1, k);
        assertArrayEquals(new int[]{5}, extract(nums, k));
    }

    @Test
    void singleElement() {
        int[] nums = {7};

        RemoveDuplicatesfromSortedArray3 sol = new RemoveDuplicatesfromSortedArray3();
        int k = sol.removeDuplicates(nums);

        assertEquals(1, k);
        assertArrayEquals(new int[]{7}, extract(nums, k));
    }

    private int[] extract(int[] nums, int k) {
        int[] res = new int[k];
        System.arraycopy(nums, 0, res, 0, k);
        return res;
    }
}