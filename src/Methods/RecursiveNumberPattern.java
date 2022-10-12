/*
 *  Scenario   : Input Format  number->16, Value-> 5  |  Output Format  [16, 11, 6, 1, -4, 1, 6, 11, 16]
 *             : Input Format  number->16, Value-> 6  |  Output Format  [16, 10, 4, -2, 4, 10, 16]
 *
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */


package Methods;

import java.util.Scanner;

public class RecursiveNumberPattern
{
    public static void main(String[] args)
    {
        int temp,value,valueTwo,number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        number = scan.nextInt();
        System.out.print("Value: ");
        valueTwo=scan.nextInt();
        temp = number;
        value = number;
        recursiveNumberPattern(number,temp,value,valueTwo);
    }

    static void recursiveNumberPattern(int number,int temp,int value,int valueTwo)
    {
        if(number>=0 && temp >0)
        {
            System.out.print(number+", ");
            number -= valueTwo ;
            temp=number;
        }
        else if(number<=value)
        {
            if (number<value)
                System.out.print(number+", ");
            else
                System.out.print(number);

            number+= valueTwo;
        }
        else
            return;

        recursiveNumberPattern(number,temp,value,valueTwo);
    }
}
