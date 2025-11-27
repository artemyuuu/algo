package org.example.SlidingWindow;

//Учитывая массив натуральных чисел nums и положительное целое число target, верните минимальную длину подмассива,
// сумма которых больше или равна target. Если такого подмассива нет, верните 0 вместо этого.
//Пример 1:
//Входные данные: target = 7, nums = [2,3,1,2,4,3]
//Выходные данные: 2
//Пояснение: Подмассив [4,3] имеет минимальную длину в рамках ограничений задачи.
//Пример 2:
//Входные данные: target = 4, nums = [1,4,4]
//Выходные данные: 1
//Пример 3:
//Входные данные: target = 11, nums = [1,1,1,1,1,1,1]
//Выходные данные: 0
public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int best = Integer.MAX_VALUE;
        int sum = 0;
        for (int right = 0; right < nums.length ; right++) {
            sum += nums[right];
            while (sum >= target) {
                int len = right - left + 1;
                sum -= nums[left];
                left++;
                if (len < best) {
                    best = len;
                }
            }

        }
        return best == Integer.MAX_VALUE ? 0 : best;
    }
}
