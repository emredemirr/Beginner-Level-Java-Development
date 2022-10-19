/*
 *  Link       : https://www.hackerrank.com/challenges/java-loops/problem
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 *  Hackerrank : https://www.hackerrank.com/emreedemir
 */

package Hackerrank;
import java.util .*;

public class JavaLoops2
{

    public static void main(String[] argh)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a + b, pow = 1, value = 0;

            if (a >= 0 && a <= 50 && b >= 0 && b <= 50 && n >= 1 && n <= 15)
            {
                System.out.print(result);
                for (int j = 1; j < n; j++)
                {
                    pow = pow * 2;
                    value = (pow * b);
                    result += value;
                    System.out.print(" " + result);
                }
                System.out.println(" ");
            }
        }
        in.close();
    }
}
