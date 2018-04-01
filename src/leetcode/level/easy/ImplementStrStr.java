package leetcode.level.easy;

/***
 *Description
 Implement strStr().
 Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 Input: haystack = "hello", needle = "ll"
 Output: 2
 Example 2:
 Input: haystack = "aaaaa", needle = "bba"
 Output: -1
 *
 * 思路
 题意是从主串中找到子串的索引，如果找不到则返回-1，当子串长度大于主串，直接返回-1，然后我们只需要遍历比较即可。
 */
public class ImplementStrStr {

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack, needle));


    }

    public static int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();

        if (len1 < len2) {
            return -1;
        }

        for (int i = 0; ; i++) {
            if (i + len2 > len1) {
                return -1;
            }

            for (int j = 0; ; j++) {
                if (j == len2) {
                    return i;
                }
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }


        }
    }

}
