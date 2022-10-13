/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Loop;
import java.util.Scanner;
public class FaktoriyelHesaplama
{
    public static void main(String[] args)
    {
        int sayi,faktoriyel=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        sayi = input.nextInt();

        for (int i =1;i<=sayi;i++)
        {
            faktoriyel *= i;
        }
        System.out.println("Faktöriyel: " +faktoriyel);
    }
}
