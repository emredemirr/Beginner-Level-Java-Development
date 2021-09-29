package Loop;
import java.util.Scanner;

public class MinMaxNumber
{
    public static void main(String[] args)
    {
        int n,sayi,min=0,max=0,counter;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        n = input.nextInt();

        for (int i =1; i<=n ;i++)
        {
            System.out.print(i+". Sayıyı Giriniz: ");
            sayi = input.nextInt();
            if (i==1)
                min= sayi;

            if (max<sayi)
            {
                max=0;
                max += sayi;
            }
            if (sayi<= min)
                min = sayi;
        }
        System.out.println("Büyük Sayı: "+max);
        System.out.println("Küçük Sayı: "+min);
    }
}
