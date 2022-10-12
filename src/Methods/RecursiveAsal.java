package Methods;

import java.util.Scanner;

public class RecursiveAsal
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        recursiveAsal(sayi, +2);
    }
    static void recursiveAsal(int sayi, int asal)
    {
        if (asal == sayi)
        {
            System.out.println(sayi + " sayısı ASALDIR!");
            return;
        }
        else if (sayi % asal == 0)
        {
            System.out.println(sayi + " sayısı ASAL değildir!");
            return;
        }
        recursiveAsal(sayi, asal + 1);
    }
}
