package Loop;
import java.util.Scanner;
public class KuvvetBulma
{
    public static void main(String[] args)
    {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        sayi = input.nextInt();

        for (int i =1; i<=sayi;i*=2)
        {
            System.out.println(i);
        }

    }
}
