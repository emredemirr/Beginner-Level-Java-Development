/*
 *  Link       : https://www.hackerrank.com/challenges/java-1d-array-introduction/problem
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 *  Hackerrank : https://www.hackerrank.com/emreedemir
 */
package Hackerrank;
import java.util.Scanner;

public class Java1DArray
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n; i++)
        {
            a[i] = scan.nextInt();
        }
        scan.close();


        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
