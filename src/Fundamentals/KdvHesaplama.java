/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Fundamentals;
import java.util.Scanner;


public class KdvHesaplama
{
    public static void main(String[] args)
    {
        float tutar,kdvOrani,fiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Tutarını Giriniz: ");
        tutar = input.nextFloat();
        kdvOrani = (tutar/100)*18;
        fiyat = tutar+kdvOrani;
        System.out.println("Ürün Fiyatı: "+ fiyat+"TL");
    }
}
