package ConditionalExpressions;
import java.util.Scanner;

public class ArtikYilHesaplama
{
    public static void main(String[] args)
    {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        yil = input.nextInt();

        if (yil%4==0)
        {
            System.out.println(yil+" artk bir yıldır.");
        }
        else
        {
            System.out.println(yil+" artık yıl değildir.");
        }

    }
}
