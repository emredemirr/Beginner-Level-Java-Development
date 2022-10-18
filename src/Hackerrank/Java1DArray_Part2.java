/*
 *  Link       : https://www.hackerrank.com/challenges/java-1d-array/problem
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 *  Hackerrank : https://www.hackerrank.com/emreedemir
 */
package Hackerrank;

import java.util.Scanner;

public class Java1DArray_Part2
{
        public static boolean canWin(int leap, int[] game)
        {
            return isSolve(leap,game,0);
        }

        public static boolean isSolve(int leap, int[] game, int i)
        {
            if(i>=game.length)
                return true;

            if(i<0 || game[i]==1)
                return false;

            game[i] = 1;
            return isSolve(leap, game, i+leap)||
                    isSolve(leap, game, i+1)||
                    isSolve(leap, game, i-1);
        }

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            while (q-- > 0)
            {
                int n = scan.nextInt();
                int leap = scan.nextInt();

                int[] game = new int[n];
                for (int i = 0; i < n; i++)
                {
                    game[i] = scan.nextInt();
                }

                System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            }
            scan.close();
        }
}
