package Loop;
import java.util.Scanner;
public class EbobEkok
{
    public static void main(String[] args)
    {
        int n1,n2,ebob=0,ekok=0;
        Scanner input = new Scanner(System.in);
        System.out.println("N1 Sayısı: ");
        n1 = input.nextInt();
        System.out.println("N2 Sayısı: ");
        n2 = input.nextInt();

        for (int i =1; i<=n1; i++)
        {
            if (n1%i==0 && n2%i==0)
            {
                ebob =i;
            }
            System.out.println("Ebob: "+ebob);
        }

        for (int i = 1; i<=(n1*n2);i++)
        {
            if (i%n1 == 0 && i%n2 == 0)
            {
                System.out.println("Ekok:"+i);
                break;
            }
        }
    }
}