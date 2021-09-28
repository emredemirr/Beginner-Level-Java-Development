package Loop;
import java.util.Scanner;
public class CiftSayiBulma
{
    public static void main(String[] args) {

        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Girin: ");
        k = input.nextInt();

        for (int i = 1;i<k;i++)
        {
            if (i%2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
