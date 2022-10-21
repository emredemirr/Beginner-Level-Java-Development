/*
 *  Link       : https://app.patika.dev/courses/java101/pratik-palindrom-string
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Other;

public class PalindromeWord
{
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str)
    {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(isPalindrome("abba"));
    }
}
