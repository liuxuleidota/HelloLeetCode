import java.util.Arrays;

/*
 * @Date: 2022-03-08 09:46:36
 * @LastEditors: xuleiliu@trip.com
 * @LastEditTime: 2022-03-08 10:02:43
 * @FilePath: /array/1.BinarySearch/Solution.java
 */
class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }

        int mid = nums.length/2;

        if (nums[mid] > target) {
            int[] temp = Arrays.copyOfRange(nums, 0, mid);
            return this.search(temp, target);
        } else if (nums[mid] < target) {
            int[] temp = Arrays.copyOfRange(nums, mid, nums.length);
            return this.search(temp, target);
        } else {
            return mid;
        }
    }
}