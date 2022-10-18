/*
 *  Link       : https://www.hackerrank.com/challenges/java-negative-subarray/problem
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 *  Hackerrank : https://www.hackerrank.com/emreedemir
 */
package Hackerrank;
import java.util.*;

public class NegativeSubarray
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }
        scan.close();

        int negativeSub = 0;
        for(int i =0; i<n;i++)
        {
            for(int j =i; j<n; j++)
            {
                int sum = 0;
                for(int k =i; k<=j; k++)
                {
                    sum += arr[k];
                }
                if(sum < 0)
                {
                    negativeSub++;
                }
            }
        }
        System.out.println(negativeSub);
    }
}
