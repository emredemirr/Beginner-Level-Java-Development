/*
 *  Link       : https://app.patika.dev/courses/java101/pratik-min-max
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */

package Arrays;

public class MinMaxOfArray
{
    public static void main(String[] args)
    {

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }

}
