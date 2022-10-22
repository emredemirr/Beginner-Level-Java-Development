/*
 *  Link       : https://www.hackerrank.com/challenges/java-string-reverse
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 *  Hackerrank : https://www.hackerrank.com/emreedemir
 */
package Hackerrank;

import java.util.Scanner;

public class JavaStringReverse
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int n =0;
        int b = A.length()-1;

        while(n <= b)
        {
            if(A.charAt(n) != A.charAt(b))
            {
                System.out.println("No");
                return;
            }
            n++;
            b--;
        }
        System.out.println("Yes");
    }
}
