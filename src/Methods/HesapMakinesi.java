/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Methods;

import java.util.Scanner;

public class HesapMakinesi
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama\n"
                +"2- Çıkarma\n"
                +"3- Çarpma\n"
                +"4- Bölme\n"
                +"5- Üs Alma\n"
                +"6- Faktöriyel\n"
                +"7- Mod Alma\n"
                +"8- Dikdörtgen Alan ve Çevre\n"
                +"0- Çıkış";

        do
        {
            System.out.println(menu);
            System.out.println("------------------");
            System.out.print("Bir İşlem Seçiniz: ");
            select = scan.nextInt();

            switch (select)
            {
                case 1:
                    System.out.println("Sonuç: "+toplama());
                case 2:
                    System.out.println("Sonuç: "+cikarma());
                case 3:
                    System.out.println("Sonuç: "+carpma());
                case 4:
                    System.out.println("Sonuç: "+bolme());
                case 5:
                    System.out.println("Sonuç: "+power());
                case 6:
                    System.out.println("Sonuç: "+faktoriyel());
                case 7:
                    System.out.println("Sonuç: "+mod());
                case 8:
                    dikdortgenAlanCevre();

                break;

            }
        }
        while (select!=0);
    }

    static int toplama()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int toplam=0,sayi , sayac = scan.nextInt();
        for (int i=1; i<=sayac;i++)
        {
            System.out.print(i+".sayı: ");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        return toplam;
    }
    static int cikarma()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int cikarma=0,sayi , sayac = scan.nextInt();
        for (int i=1; i<=sayac;i++)
        {
            System.out.print(i+".sayı: ");
            sayi = scan.nextInt();
            if (i==1)
            {
                cikarma += sayi;
                continue;
            }
            cikarma = cikarma-sayi;
        }
        return cikarma;
    }
    static int carpma()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int carpim=1,sayi , sayac = scan.nextInt();
        for (int i=1; i<=sayac;i++)
        {
            System.out.print(i+".sayı: ");
            sayi = scan.nextInt();
            carpim *= sayi;
        }
        return carpim;
    }
    static double bolme()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        return result;
    }
    static int power()
    {
        int taban,us,sonuc=1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Sayısını Giriniz: ");
        taban = scan.nextInt();
        System.out.print("Üs sayısını Giriniz: ");
        us = scan.nextInt();

        for (int i =1; i<=us;i++)
        {
            sonuc *= taban;
        }

        return sonuc;
    }
    static int faktoriyel()
    {
        int i,sayi,sonuc=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        sayi = scan.nextInt();
        for (i=1;i<=sayi;i++)

        {
            sonuc *= i;
        }
        return sonuc;

    }
    static int mod()
    {
        int sayi,mod,sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        sayi = scan.nextInt();
        System.out.print("Modu Giriniz: ");
        mod = scan.nextInt();

        sonuc = sayi%mod;
        return sonuc;
    }
    static void dikdortgenAlanCevre()
    {
        int kisaKenar,uzunKenar,alan=1,cevre=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kısa Kenarı Giriniz: ");
        kisaKenar = scan.nextInt();
        System.out.print("Uzun Kenarı Giriniz: ");
        uzunKenar = scan.nextInt();

        alan = kisaKenar*uzunKenar;
        cevre= (kisaKenar+uzunKenar)*2;

        System.out.println("Alan: "+alan);
        System.out.println("Çevre: "+cevre);
    }

}
