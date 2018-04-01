package leetcode.level.easy;

/***
 *
 * Description
 Determine whether an integer is a palindrome. Do this without extra space.
 *
 *思路 1

 好好思考下是否需要计算整个长度，比如 1234321，其实不然，我们只需要计算一半的长度即可，
 就是在计算过程中的那个逆序数比不断除 10 的数大就结束计算即可，但是这也带来了另一个问题，
 比如 10 的倍数的数 10010，它也会返回 true，所以我们需要对 10 的倍数的数再加个判断即可
 */
public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isPalindromeNumber(1234321));
        System.out.println(isPalindromeNumber(1010));
        System.out.println(isPalindromeNumber(101));

    }

    public static boolean isPalindromeNumber(int x){

        if (x < 0 || (x != 0 && x % 10 == 0)) { //0也是回文
            return false;
        }

        int halfX=0;
        while(x>halfX){
            halfX=halfX*10+x%10;
            x/=10;
        }

        return halfX == x || halfX / 10 == x;
    }

}
