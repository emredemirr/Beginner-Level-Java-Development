/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Fundamentals;
import java.util.Scanner;

public class HipotenusHesaplama
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int kısaKenar,uzunKenar; double hipotenus;
        System.out.print("Kısa Kenarı Giriniz: ");
        kısaKenar = input.nextInt();
        System.out.print("Uzun Kenarı Giriniz: ");
        uzunKenar = input.nextInt();
        hipotenus = Math.sqrt((kısaKenar*kısaKenar)+(uzunKenar*uzunKenar));
        System.out.println("Hippotenus: "+hipotenus);
    }
}
