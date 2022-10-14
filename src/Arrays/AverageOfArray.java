/*
 *  Link       : https://app.patika.dev/courses/java101/pratik-array-ortalama
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */

package Arrays;

public class AverageOfArray
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);
    }
}
