/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */

package ConditionalExpressions;
import java.util.Scanner;
public class BurcBulma
{
    public static void main(String[] args)
    {
        int month,day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();


        if (day>=1 && day<=31 && month>=1 && month<= 12)
        {
            switch (month)
            {
                case 1:
                    if (day<22)
                        burc ="Oğlak Burcu" ;
                    else
                        burc ="Kova Burcu" ;
                    break;

                case 2:
                    if (day >= 1 && day <= 28)
                    {
                        if (day<20)
                            burc ="Kova Burcu";
                        else
                            burc ="Balık Burcu" ;
                    }
                    break;

                case 3:
                    if (day<21)
                        burc= "Balık Burcu";
                    else
                        burc= "Koç Burcu" ;
                    break;

                case 4:
                    if (day<20)
                        burc= "Koç Burcu";
                    else
                        burc= "Boğa Burcu" ;
                    break;
                case 5:
                    if (day<21)
                        burc= "Boğa Burcu";
                    else
                        burc= "İkizler Burcu" ;
                    break;
                case 6:
                    if (day<23)
                        burc= "İkizler Burcu";
                    else
                        burc= "Yengeç Burcu" ;
                    break;
                case 7:
                    if (day<23)
                        burc= "Yengeç Burcu";
                    else
                        burc= "Aslan Burcu" ;
                    break;
                case 8:
                    if (day<23)
                        burc= "Aslan Burcu";
                    else
                        burc= "Başak Burcu" ;
                    break;
                case 9:
                    if (day<23)
                        burc= "Başak Burcu";
                    else
                        burc= "Terazi Burcu" ;
                    break;
                case 10:
                    if (day<23)
                        burc= "Terazi Burcu";
                    else
                        burc= "Akrep Burcu" ;
                    break;
                case 11:
                    if (day<22)
                        burc= "Akrep Burcu";
                    else
                        burc= "Yay Burcu" ;
                    break;
                case 12:
                    if (day<22)
                        burc= "Yay Burcu";
                    else
                        burc= "Oğlak Burcu" ;
                    break;
            }
            System.out.println("Burcunuz: "+burc);
        }
        else
        {
            System.out.println("Hatalı giriş yaptınız !");
        }


    }
}
