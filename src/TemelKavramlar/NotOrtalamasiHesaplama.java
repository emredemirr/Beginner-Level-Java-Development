package TemelKavramlar;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class NotOrtalamasiHesaplama
{
    public static void main(String[] args)
    {
        int mat,fizik,kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuz: ");
        mat = input.nextInt();
        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();
        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();
        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextInt();
        System.out.println("Tarih Notunuz: ");
        tarih  = input.nextInt();
        System.out.println("Muzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam /6;
        System.out.println("Ortalamanız: "+sonuc);

        boolean status = (sonuc<=60)== false;
        String durum = status ? "Geçti":"Kaldı";
        System.out.println("Durumu: "+durum);
    }

}
