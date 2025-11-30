package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = k % nums.length;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int i = nums[left];
            nums[left] = nums[right];
            nums[right] = i;
            left++;
            right--;
        }
        left = 0;
        right = k-1;
        while (left <= right) {
            int i = nums[left];
            nums[left] = nums[right];
            nums[right] = i;
            left++;
            right--;
        }
        left = k;
        right = nums.length-1;
        while (left <= right) {
            int i = nums[left];
            nums[left] = nums[right];
            nums[right] = i;
            left++;
            right--;
        }



        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}