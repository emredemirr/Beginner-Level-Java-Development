package FinalProject;

import java.util.Scanner;

public class MineSweeper
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Satır Sayısını Giriniz: ");
        int row = scan.nextInt();
        System.out.print("Sütun Sayısını Giriniz: ");
        int col = scan.nextInt();

        char [][] arr = new char[row][col];
        char [][] mineLocation = new char[row][col];
        char sign = '-', mine = '*';
        int mineNumber = (row*col)/4;
        int randomRow, randomCol, step = 0;

        for (int i = 0; i<mineNumber;i++)
        {
            randomRow = (int) (Math.random()*row);
            randomCol = (int) (Math.random()*col);

            if (mineLocation[randomRow][randomCol] == '*')
                i--;
            else
                mineLocation[randomRow][randomCol] = mine;

        }
        System.out.println("Mayınların Konumu");
        for (int i = 0; i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                if (mineLocation[i][j] == mine)
                    arr[i][j] = mineLocation[i][j];
                else
                    arr[i][j] = sign;

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=====================");

        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz! ");
        for (int x =0; x< row*col;x++)
        {
            System.out.print("Satır Giriniz: ");
            int choseRow = scan.nextInt();
            System.out.print("Sütun Giriniz: ");
            int choseCol = scan.nextInt();

            if (choseRow >=0 && choseRow<=row && choseCol>=0 && choseCol <= col)
            {
                if (arr[choseRow][choseCol] == mine)
                {
                    System.out.println(">>Game Over<<");
                    System.out.println("Mayınların Konumu");
                    for (int i = 0; i<arr.length;i++)
                    {
                        for (int j=0;j<arr[i].length;j++)
                        {
                            System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
                }
                else if (arr[choseRow][choseCol] == sign)
                {
                    for (int i =-1; i<2;i++)
                    {
                        for (int j =-1;j<2;j++)
                        {
                            if (arr[choseRow+i][choseCol+j] == mine && i != 0 && j != 0)
                                step++;
                        }
                    }

                    if (step ==0)
                        arr[choseRow][choseCol] = '0';
                    else if (step==1)
                        arr[choseRow][choseCol] = '1';
                    else if (step == 2)
                        arr[choseRow][choseCol] = '2';
                    else if (step == 3)
                        arr[choseRow][choseCol] = '3';


                    for (int i = 0; i<arr.length;i++)
                    {
                        for (int j=0;j<arr[i].length;j++)
                        {
                            System.out.print(arr[i][j]+" ");

                        }
                        System.out.println();
                    }
                    System.out.println("Step: "+step);

                }
            }
            else
            {
                System.out.println("Dizi Dışında Değer Girdiniz ! Tekrar Deneyin.");
            }

            System.out.println("========================");
        }


    }

}
