package leetcode.level.easy;

/***
 *Description
 Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 * 思路 0

 题意是求数组中子数组的最大和，这种最优问题一般第一时间想到的就是动态规划，我们可以这样想，当部分序列和大于零的话就一直加下一个元素即可，
 并和当前最大值进行比较，如果出现部分序列小于零的情况，那肯定就是从当前元素算起。
 其转移方程就是 dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);，
 由于我们不需要保留 dp 状态，故可以优化空间复杂度为 1，即 dp = nums[i] + (dp > 0 ? dp : 0);。
 *
 */
public class MaximumSubarray {

    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int dp = nums[0];
        for (int i = 1; i < len; i++) {
            dp = nums[i] + (dp > 0 ? dp : 0);
            max = Math.max(dp, max);
        }
        return max;
    }
}
