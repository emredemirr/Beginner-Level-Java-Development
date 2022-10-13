/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Loop;
import java.util.Scanner;

public class TersUcgen
{
    public static void main(String[] args)
    {
        int number,spaceLoop=1,starLoop;
        char star ='*', space =' ';
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Basamaklı olsun: ");
        number = input.nextInt();
        starLoop=number;

        for(int i =0;i<number;i++) {
            for (int j =0; j<spaceLoop;j++) {
                System.out.print(space);
            }
            spaceLoop++;

            for (int k=1;k<(starLoop*2);k++) {
                System.out.print(star);
            }
            starLoop=starLoop-1;

            System.out.print("\n");
        }

    }
}
