package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman Sayısını Giriniz: ");
        int n = scan.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
            int number = scan.nextInt();
            list[i] = number;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
