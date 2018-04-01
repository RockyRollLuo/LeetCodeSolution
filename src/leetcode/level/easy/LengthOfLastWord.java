package leetcode.level.easy;

/***
 *Description
 Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 If the last word does not exist, return 0.
 Note: A word is defined as a character sequence consists of non-space characters only.
 Example:
 Input: "Hello World"
 Output: 5
 *
 * 思路

 题意是让你从一个只包含大小字母和空格字符的字符串中得到最后一个单词的长度，
 我们倒序遍历，先得到最后一个非空格字符的索引，然后再得到它前面的空格字符索引，两者相减即可。
 当然，我们使用 API 来完成这件事更加方便，只需一行代码 return s.trim().length() - s.trim().lastIndexOf(" ") - 1;，
 但我相信作者出这道题的目的肯定不是考你 API 的使用，所以我们还是用自己的思路来实现。
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String s="hello world";
        System.out.println(lengthOfLastWord(s));

        String s1="what the fuck ";
        System.out.println(lengthOfLastWord(s1));

    }

    public static int lengthOfLastWord(String s) {
        int p = s.length() - 1;

        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }
        int end = p;
        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
        }
        return end - p;
    }

}
