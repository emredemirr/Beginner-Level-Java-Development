package Loop;
import java.util.Scanner;
public class UsBulma
{
    public static void main(String[] args)
    {
        int sayi,total=1,us;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı:");
        sayi=input.nextInt();
        System.out.print("Kuvvet: ");
        us = input.nextInt();

        for (int i = 1; i<=us;i++)
        {
            total *= sayi;
        }
        System.out.println("Sonuç:" + total);


    }
}
