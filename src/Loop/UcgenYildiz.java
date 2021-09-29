package Loop;
import java.util.Scanner;

public class UcgenYildiz
{
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("N değerini girin: ");
        n = input.nextInt();

        for (int i =1; i<=n;i++)
        {
            for (int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for (int k =1;k<=(2*i)-1;k++)
            {
                System.out.print("x");
            }
            System.out.println(" ");
        }
    }
}