/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Loop;

import java.util.Scanner;

public class MukemmelSayi
{
    public static void main(String[] args)
    {
        int number,total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Girin: ");
        number = input.nextInt();

        for (int i=1; i<number;i++)
        {
            if (number%i == 0)
            {
                total += i;
            }
        }
        System.out.println(total);

        if (total==number)
            System.out.println(number+" Mükemmel Sayıdır.");
        else
            System.out.println(number+" Mükemmel Sayı Değildir.");

    }
}
