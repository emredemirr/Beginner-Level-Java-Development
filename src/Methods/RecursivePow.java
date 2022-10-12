/*
 *  Link       : https://app.patika.dev/courses/java101/odev-recursive-power
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Methods;

import java.util.Scanner;

public class RecursivePow
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int taban,us,sonuc;
        System.out.print("Taban Değeri Giriniz: ");
        taban = scan.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        us = scan.nextInt();
        sonuc = recursivePow(taban, us);
        System.out.println("Sonuç: " + sonuc);
    }

    public static int recursivePow(int taban, int us)
    {
        if (taban == 0)
            return 0;

        if (taban != 0 && us == 0)
            return 1;

        return recursivePow(taban, us - 1) * taban;
    }
}
