package ConditionalExpressions;
import java.util.Scanner;
/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
public class HesapMakinasi
{
    public static void main(String[] args)
    {
        int number1,number2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı girin: ");
        number1 = input.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma \n3-Çarpma \n4-Bölme ");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();


            switch (select)
            {
                case 1:
                    System.out.println("Toplam: "+(number1+number2));
                    break;
                case 2:
                    System.out.println("Çıkarma: "+(number1-number2));
                    break;
                case 3:
                    System.out.println("Çarpma: "+(number1*number2));
                    break;
                case 4:
                    if (number2 !=0)
                        System.out.println("Bölme: "+(number1/number2));
                    else
                        System.out.println("Bir sayı sıfıra bölünemez !");
                    break;
                default:
                    System.out.println(" Yanlış Seçim !. ");
            }
        }
}
