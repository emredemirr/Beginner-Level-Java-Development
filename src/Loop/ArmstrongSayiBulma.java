/*
 *  Armstrong Sayı Nedir ?
 *   N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının
 *   kendisine eşitse, böyle sayılara Armstrong sayı denir.
 *
 *   Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
 *   Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
 *
 *   1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye
 *   eşit olmadığı için armstrong sayı olmaz.
 *
 *   1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
 *
 *   54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
 *
 *
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Loop;
import java.util.Scanner;
public class ArmstrongSayiBulma
{
    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int sayi = input.nextInt();
        int basamak=0,pow,result=0;
        int tempSayi=sayi, basamakDegeri;

        while(tempSayi !=0)
        {
            tempSayi /=10;
            basamak++;
        }

        tempSayi=sayi;
        while(tempSayi !=0)
        {
            basamakDegeri = tempSayi %10;
            pow =1;
            for (int i = 1; i<=basamak;i++)
            {
                pow *= basamakDegeri;
            }
            result += pow;
            tempSayi /=10;
        }
        if (result == sayi) {
            System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir Armstrong sayısı değildir.");
        }

    }
}