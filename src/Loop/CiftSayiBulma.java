/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Loop;
import java.util.Scanner;
public class CiftSayiBulma
{
    public static void main(String[] args) {

        int k,sayac=0;
        double ort=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Girin: ");
        k = input.nextInt();
        for (int i = 1;i<k;i++)
        {
            if (i%3 == 0 && i%4==0)
            {
                sayac++;
                ort += i;

            }
        }
        System.out.println(ort/sayac);
    }
}
