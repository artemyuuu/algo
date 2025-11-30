package ArrayString;

import org.example.ArrayString.RemoveElement2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElement2Test {

    @Test
    void example1_fromDescription() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        RemoveElement2 solution = new RemoveElement2();
        int k = solution.removeElement(nums, val);

        assertEquals(2, k);
        assertArrayEquals(new int[]{2, 2}, extract(nums, k));
    }

    @Test
    void example2_fromDescription() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        RemoveElement2 solution = new RemoveElement2();
        int k = solution.removeElement(nums, val);

        assertEquals(5, k);

        // порядок не фиксирован, но первые 5 должны быть из набора {0,1,3,0,4}
        int[] result = extract(nums, k);
        int[] expected = {0, 1, 3, 0, 4};
        assertHaveSameElements(expected, result);
    }

    @Test
    void noElementsMatch() {
        int[] nums = {1, 2, 3};
        int val = 5;

        RemoveElement2 solution = new RemoveElement2();
        int k = solution.removeElement(nums, val);

        assertEquals(3, k);
        assertArrayEquals(new int[]{1, 2, 3}, extract(nums, k));
    }

    @Test
    void allElementsMatch() {
        int[] nums = {2, 2, 2};
        int val = 2;

        RemoveElement2 solution = new RemoveElement2();
        int k = solution.removeElement(nums, val);

        assertEquals(0, k);
    }

    @Test
    void emptyArray() {
        int[] nums = {};
        int val = 2;

        RemoveElement2 solution = new RemoveElement2();
        int k = solution.removeElement(nums, val);

        assertEquals(0, k);
    }

    // helper: берём первые k элементов
    private int[] extract(int[] nums, int k) {
        int[] res = new int[k];
        System.arraycopy(nums, 0, res, 0, k);
        return res;
    }

    // helper: сравниваем множества значений (порядок не важен)
    private void assertHaveSameElements(int[] expected, int[] actual) {
        java.util.Arrays.sort(expected);
        java.util.Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
