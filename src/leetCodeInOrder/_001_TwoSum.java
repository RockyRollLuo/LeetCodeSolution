package leetCodeInOrder;

import java.util.HashMap;

/**
 * // #1 两数之和
 描述：给定一个整数数组和一个值target，求两个下标i、j，使得a[i] + a[j] = target，返回下标。

 思路： 利用 HashMap 作为存储，键为目标值减去当前元素值，索引为值，比如 i = 0 时，此时首先要判断 nums[0] = 2 是否在 map 中，
 如果不存在，那么插入键值对 key = 9 - 2 = 7, value = 0，之后当 i = 1 时，此时判断 nums[1] = 7 已存在于 map 中，
 那么取出该 value = 0 作为第一个返回值，当前 i 作为第二个返回值。
 */
public class _001_TwoSum {

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
