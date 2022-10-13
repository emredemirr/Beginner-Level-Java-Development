/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Loop;
import java.util.Scanner;

public class HarmonikOrtalama
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("N sayısını girin: ");
        int n = input.nextInt();
        double result =0;
        for (double i =1;i<=n;i++)
        {
            result +=(1/i);
        }
        System.out.println("Sonuç: "+result);
    }
}
