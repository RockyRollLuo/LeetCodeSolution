package leetcode.level.easy;

/***
 Description
 Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 You may assume no duplicates in the array.
 Example 1:
 Input: [1,3,5,6], 5
 Output: 2
 Example 2:
 Input: [1,3,5,6], 2
 Output: 1
 *
 * 思路

 题意是让你从一个没有重复元素的已排序数组中找到插入位置的索引。因为数组已排序，所以我们可以想到二分查找法，
 因为查找到的条件是找到第一个等于或者大于 target 的元素的位置，所以二分法略作变动即可。
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=(low+high)>>1;

        while (low <= high) {
            if (nums[mid] >= target) {
                high = mid - 1;
            } else{
                low = mid + 1;
            }
            mid = (low + high) >> 1;
        }
        return low;
    }
}
