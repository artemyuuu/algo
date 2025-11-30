package org.example.ArrayString;

//Дан целочисленный массив nums. Поверните массив вправо на k шагов, где k — неотрицательное число.
//Пример 1:
//Входные данные: nums = [1,2,3,4,5,6,7], k = 3
//Выходные данные: [5,6,7,1,2,3,4]
//Пояснение:
//поворот на 1 шаг вправо: [7,1,2,3,4,5,6]
//поворот на 2 шага вправо: [6,7,1,2,3,4,5]
//повернуть на 3 шага вправо: [5,6,7,1,2,3,4]
//Пример 2:
//Входные данные: nums = [-1,-100,3,99], k = 2
//Выходные данные: [3,99,-1,-100]
//Пояснение:
//поворот на 1 шаг вправо: [99,-1,-100,3]
//поворот на 2 шага вправо: [3,99,-1,-100]
public class RotateArray6 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        k = k % nums.length;
        if (k == 0) return;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length);

    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int i = nums[left];
            nums[left] = nums[right];
            nums[right] = i;
            left++;
            right--;
        }
    }
}
