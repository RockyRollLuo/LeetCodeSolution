package leetcode.level.easy;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * <p>
 * Solution: O(n log n). Wrap index and element in a class and sort in increasing order. Do a two pointer sum and compare.
 * An alternative solution is to use hashing which is a O(n) solution - For each element e check if element (target - e)
 * is already found in hashset, if yes return their index, else add this to hash-set and continue.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;

        int[] ans = twoSum(nums, target);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }


    public static int[] twoSum(int[] nums,int target) {
        HashMap<Integer,Integer> map=new HashMap<>();  //map中存的数组中每个元素需要的相加的数
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){           //需要的数存在于数组中
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target-nums[i],i);
        }
        return null;
    }


}
