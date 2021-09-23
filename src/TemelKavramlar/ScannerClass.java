package TemelKavramlar;
import java.util.Scanner;


public class ScannerClass
{
    public static void main(String[] args)
    {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("A sayısını Girin: ");
        a = input.nextInt();
        System.out.println(a);

        System.out.println("Bir değer girin: ");
        double b = input.nextDouble();
        System.out.println(b);
    }
}
