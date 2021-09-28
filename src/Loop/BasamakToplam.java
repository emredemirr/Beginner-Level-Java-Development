package Loop;

import java.util.Scanner;

public class BasamakToplam
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int sayi = input.nextInt();
        int result=0,tempSayi;

        while(sayi !=0)
        {
            tempSayi = sayi%10;
            result+=tempSayi;
            sayi/=10;
        }
        System.out.println(result);
    }
}
