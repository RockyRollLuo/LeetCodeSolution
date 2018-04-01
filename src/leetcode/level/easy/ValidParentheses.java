package leetcode.level.easy;

import java.util.Stack;

/***
 *Description

 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * 思路

 题意是判断括号匹配是否正确，很明显，我们可以用栈来解决这个问题，当出现左括号的时候入栈，
 当遇到右括号时，判断栈顶的左括号是否何其匹配，不匹配的话直接返回 false 即可，
 最终判断是否空栈即可，这里我们可以用数组模拟栈的操作使其操作更快，有个细节注意下 top = 1;，从而省去了之后判空的操作和 top - 1 导致数组越界的错误。
 */
public class ValidParentheses {

    public static void main(String[] args) {

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        try {
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                }else if (c == ')' && stack.pop() != '(') {
                    return false;
                } else if (c == ']' && stack.pop()!= '[') {
                    return false;
                } else if (c == '}' && stack.pop()!= '{') {
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return stack.empty()==true?true:false;
    }


}
