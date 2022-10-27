/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Fundamentals;
import java.util.Scanner;
public class DaireAlanCevreHesaplama
{
    public static void main(String[] args)
    {
        int yariCap;
        double pi = 3.1415, alan, cevre;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı Giriniz: ");
        yariCap = input.nextInt();

        alan = pi*yariCap*yariCap;
        cevre = 2*pi*yariCap;
        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Dairenin Çevresi: "+cevre);
    }
}
