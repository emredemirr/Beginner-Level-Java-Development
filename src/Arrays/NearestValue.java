/*  Scenario   : Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulma
 *               -------
 *               Output
 *               -------
 *               Girilen Sayı : 5
 *               Girilen sayıdan küçük en yakın sayı : 2
 *               Girilen sayıdan büyük en yakın sayı : 12
 *
 *  Link       : https://app.patika.dev/courses/java101/pratik-min-max
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NearestValue
{
    public static  void main(String[] args)
    {
        int minValue=0,maxValue=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number =  scan.nextInt();

        int[] arr = {55,46,12,21,1,5,9,78,24,15,95,235,415,18};

        Arrays.sort(arr);
        while (minValue == 0)
        {
            number--;
            for (int i =0; i<arr.length;i++)
            {
                if (arr[i]==number)
                {
                    minValue = number;
                    System.out.println("Girilen sayıdan küçük en yakın sayı :"+ minValue);
                }
            }

        }
        while (maxValue == 0)
        {
            number++;
            for (int i =0; i<arr.length;i++)
            {
                if (arr[i]==number)
                {
                    maxValue = number;
                    System.out.println("Girilen sayıdan büyük en yakın sayı :"+maxValue);
                }
            }

        }
    }
}
