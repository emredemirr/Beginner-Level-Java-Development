/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Loop;
import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int n,fibonacci=0,a=0,b=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısını Giriniz: ");
        n = input.nextInt();


        System.out.println(fibonacci);
        System.out.println(fibonacci+1);
        for (int i =1;i<n;i++)
        {
            fibonacci = a + b;
            System.out.println(fibonacci);
            a=b;
            b=fibonacci;
        }
    }
}
