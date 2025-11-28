package org.example.ArrayString;

//Вам даны два целочисленных массива nums1 и nums2, отсортированных в порядке неубывания, и два целых числа m и n,
//обозначающих количество элементов в nums1 и nums2 соответственно.
//Объединить nums1 и nums2 в один массив, отсортированный в порядке возрастания.
//Окончательный отсортированный массив не должен возвращаться функцией, вместо этого он должен быть сохранён внутри массива nums1.
// Для этого nums1имеет длину m + n, где первые mэлементы обозначают элементы, которые следует объединить,
// а последние nэлементы имеют значение 0и должны игнорироваться. nums2 имеет длину n.
//Example 1:
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//Example 2:
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//Example 3:
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
public class MergeSortedArray1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if ( i >= 0 && nums1[i] > nums2[j] ) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

    }
}

