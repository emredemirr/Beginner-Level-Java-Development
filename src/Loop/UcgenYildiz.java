package Loop;
import java.util.Scanner;

public class UcgenYildiz
{
    public static void main(String[] args)
    {
        int number,spaceLoop=1,starLoop;
        char star ='*', space =' ';
        Scanner input = new Scanner(System.in);
        System.out.println("N değerini girin: ");
        number = input.nextInt();
        starLoop=number;

        for (int i =1; i<=number;i++)
        {
            if(i==number)
                break;

            for (int j=1;j<=(number-i);j++)
            {
                System.out.print(space);
            }
            for (int k =1;k<=(2*i)-1;k++)
            {
                System.out.print(star);
            }
            System.out.println(space);
        }

        for(int z =0;z<number;z++)
        {
            for (int y =1; y<spaceLoop;y++)
            {
                System.out.print(space);
            }
            spaceLoop++;

            for (int x=1;x<(starLoop*2);x++)
            {
                System.out.print(star);
            }
            System.out.println(space);
            starLoop=starLoop-1;

        }
    }
}