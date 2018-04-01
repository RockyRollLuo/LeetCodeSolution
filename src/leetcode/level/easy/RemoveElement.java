package leetcode.level.easy;

/***
 *Remove Element

 Description

 Given an array and a value, remove all instances of that value in-place and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:

 Given nums = [3,2,2,3], val = 3,

 Your function should return length = 2, with the first two elements of nums being 2.
 *
 * 思路

 题意是移除数组中值等于 val 的元素，并返回之后数组的长度，并且题目中指定空间复杂度为 O(1)，
 我的思路是用 tail 标记尾部，遍历该数组时当索引元素不等于 val 时，tail 加一，尾部指向当前元素，最后返回 tail 即可。
 */


public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val=3;


    }

    public static int removeElement(int[] nums, int val) {
        int count=0;

        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] != val) {
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}
