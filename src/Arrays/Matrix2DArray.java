package Arrays;

public class Matrix2DArray
{
    public static void main(String[] args)
    {
        int [][] matrix = new int[10][10];
        int number =1;

        for (int i = 0; i<matrix.length;i++)
        {
            for (int j=0;j<matrix[i].length;j++)
            {
                matrix[i][j] = number++;
            }
        }
        for (int i = 0; i<matrix.length;i++)
        {
            for (int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
                if (i==0)
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
