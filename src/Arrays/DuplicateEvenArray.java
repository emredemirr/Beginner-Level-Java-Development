/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Arrays;

public class DuplicateEvenArray
{

    public static boolean isFind(int[] arr, int value)
    {
        for (int i: arr)
        {
            if (i==value)
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] list = {3,7,4,3,3,2,9,10,21,2,1,33,9,1,4};
        int[] duplicate = new int[list.length];
        int startIndex =0;
        for (int i =0; i<list.length;i++)
        {
            for (int j=0;j< list.length;j++)
            {
                if ((i != j) && (list[i]==list[j]))
                {
                    if (! isFind(duplicate,list[i]) )
                    {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicate)
        {
            if (value !=0  && (value % 2 == 0))
                System.out.print(value+", ");
        }
    }
}
