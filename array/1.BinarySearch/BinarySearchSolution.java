import java.util.Arrays;

/*
 * @Date: 2022-03-08 09:46:36
 * @LastEditors: xuleiliu@trip.com
 * @LastEditTime: 2022-03-10 18:13:12
 * @FilePath: /array/1.BinarySearch/Solution.java
 */
class BinarySearchSolution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int low = 0;
        int high = nums.length-1;

        return subSearch(nums, low, high, target);
    }

    public int subSearch(int[] nums, int low, int high, int target){
        if (low > high) {
            return -1;
        }
        
        int mid = (low + high)/2;

        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            high = mid - 1;
            return subSearch(nums, low, high, target);
        } else {
            low = mid + 1;
            return subSearch(nums, low, high, target);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        // int target = 2;
        BinarySearchSolution s = new BinarySearchSolution();
        int rst = s.search(nums, target);
        System.out.println(rst);
    }
}