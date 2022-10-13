/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Loop;
import java.util.Scanner;

public class TekSayilarinToplami
{
    public static void main(String[] args)
    {
        int n,total=0;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.print("Sayi Giriniz: ");
            n = input.nextInt();
            if (n %4 == 0)
            {
                total+=n;
            }
        }
        while (n%2==1);

        System.out.println("Toplam:" + total);
    }
}
