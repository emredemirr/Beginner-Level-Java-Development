/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package ConditionalExpressions;
import java.util.Scanner;

public class CinZodyagi
{
    public static void main(String[] args)
    {
        int dogumYili,zodyakBurcu;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Girin: ");
        dogumYili = input.nextInt();
        zodyakBurcu = dogumYili%12;
        switch (zodyakBurcu)
        {
            case 0:
                System.out.println("Maymun Burcu");
                break;
            case 1:
                System.out.println("Horoz Burcu");
                break;
            case 2:
                System.out.println("Köpek Burcu");
                break;
            case 3:
                System.out.println("Domuz Burcu");
                break;
            case 4:
                System.out.println("Fare Burcu");
                break;
            case 5:
                System.out.println("Öküz Burcu");
                break;
            case 6:
                System.out.println("Kaplan Burcu");
                break;
            case 7:
                System.out.println("Tavşan Burcu");
                break;
            case 8:
                System.out.println("Ejderha Burcu");
                break;
            case 9:
                System.out.println("Yılan Burcu");
                break;
            case 10:
                System.out.println("At Burcu");
                break;
            case 11:
                System.out.println("Koyun Burcu");
                break;

        }
    }
}
