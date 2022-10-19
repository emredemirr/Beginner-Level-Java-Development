/*
 *  Link       : https://www.hackerrank.com/challenges/java-if-else/problem
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 *  Hackerrank : https://www.hackerrank.com/emreedemir
 */

package Hackerrank;

import java.util.*;

public class JavaIfElse
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N >= 1 && N <= 100)
        {
            if (N % 2 > 0)
            {
                System.out.println("Weird");
            }
            else if (N >= 2 && N <= 5 && N % 2 == 0)
            {
                System.out.println("Not Weird");
            }
            else if (N >= 6 && N <= 20 && N % 2 == 0)
            {
                System.out.println("Weird");
            }
            else if (N >= 20 && N % 2 == 0)
            {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}
