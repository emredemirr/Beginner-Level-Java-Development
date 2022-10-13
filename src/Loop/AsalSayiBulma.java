/*
 *  Ödev       : Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız
 *  Senaryo    : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 *  Link       : https://app.patika.dev/courses/java101/odev-asal-sayi
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */

package Loop;

public class AsalSayiBulma
{
    public static void main(String[] args)
    {

        int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                System.out.print(sayi+", ");
                sayac++;
            }
        }
    }
}
