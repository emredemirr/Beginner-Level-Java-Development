/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Fundamentals;
import java.util.Scanner;

public class TaksimetreHesaplama
{
    public static void main(String[] args)
    {
        double km, tutar=2.20, ucret;
        int acılısUcreti =10;
        Scanner input = new Scanner(System.in);
        System.out.print("Km bilgisini giriniz: ");
        km =input.nextDouble();

        ucret = (km*tutar)+acılısUcreti;
        ucret = (ucret <20) ? 20 : ucret;
        System.out.println("Toplam Tutar: "+ucret);

    }
}
