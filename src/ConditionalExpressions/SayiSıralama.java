/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package ConditionalExpressions;
import java.util.Scanner;
public class SayiSıralama
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("A sayısını Giriniz: ");
        a=input.nextInt();
        System.out.print("B sayısını Giriniz: ");
        b=input.nextInt();
        System.out.print("C sayısını Giriniz: ");
        c=input.nextInt();

        if ((a>b)&&(a>c))
        {
            if (b>c)
            {
                System.out.println("a>b>c");
            }
            else
            {
                System.out.println("a>c>b");
            }
        }
        else if((b>a)&&(b>c))
        {
            if (a>c)
            {
                System.out.println("b>a>c");
            }
            else
            {
                System.out.println("b>c>a");
            }
        }
        else
        {
            if (a>b)
            {
                System.out.println("c>a>b");
            }
            else
            {
                System.out.println("c>b>a");
            }
        }

    }
}
