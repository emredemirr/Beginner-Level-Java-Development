package ConditionalExpressions;
import java.util.Scanner;

public class SinifGecmeDurumu
{
    public static void main(String[] args)
    {
        int mat,fizik,turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        double avg = (mat+fizik+turkce+kimya+muzik)/5;

        if (mat>0 && mat<100 && fizik>0 && fizik<100 && turkce>0 && turkce<100 && kimya>0 && kimya<100 && muzik>0 && muzik<100)
        {
            if (avg<60)
            {
                System.out.println("Sınıfta kaldınız :(");
            }
            else
            {
                System.out.println("Tebrikler sınıfı geçtiniz :)");
            }
            System.out.println("Ortalamanız: "+avg);
        }
        else
        {
            System.out.println("Uyarı ! Notlar 0 ile 100 aralığında olmalıdır!.");
        }


    }
}
