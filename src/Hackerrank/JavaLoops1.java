/*
 *  Link       : https://www.hackerrank.com/challenges/java-loops-i/problem
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 *  Hackerrank : https://www.hackerrank.com/emreedemir
 */
package Hackerrank;
import java.io.*;

public class JavaLoops1
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int t = 0;
        for (int i = 1; i <= 10; i++)
        {
            t = N * i;
            System.out.println(N + " x " + i + " = " + t);
        }
        bufferedReader.close();
    }
}