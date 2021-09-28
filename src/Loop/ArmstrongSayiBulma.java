package Loop;
import java.util.Scanner;
public class ArmstrongSayiBulma
{
    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int sayi = input.nextInt();
        int basamak=0,pow,result=0;
        int tempSayi=sayi, basamakDegeri;

        while(tempSayi !=0)
        {
            tempSayi /=10;
            basamak++;
        }

        tempSayi=sayi;
        while(tempSayi !=0)
        {
            basamakDegeri = tempSayi %10;
            pow =1;
            for (int i = 1; i<=basamak;i++)
            {
                pow *= basamakDegeri;
            }
            result += pow;
            tempSayi /=10;
        }
        if (result == sayi) {
            System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir Armstrong sayısı değildir.");
        }

    }
}