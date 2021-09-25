package ConditionalExpressions;
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama
{
    public static void main(String[] args)
    {
        int mesafe,yas,tip;
        double ucret,yasIndirimi=0,biletTuruIndirimi=0,toplamTutar;


        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınız: ");
        yas = input.nextInt();
        System.out.print("1- Tek Yön\n2-Gidiş-Dönüş\n");
        System.out.print("Bilet Türü: ");
        tip = input.nextInt();

        ucret = mesafe*(0.10);
        if (yas>=0 && yas<=120 && mesafe>0 && tip>=1 && tip<=2)
        {
            if (tip ==2)
            {
                biletTuruIndirimi = (ucret - yasIndirimi) * (0.2);
            }

            if (yas<12)
            {
                yasIndirimi=ucret*(0.5);
            }
            else if (yas>=12 && yas<=24)
            {
                yasIndirimi=ucret*(0.1);
            }
            else if(yas>=65)
            {
                yasIndirimi = ucret * (0.3);
            }

            toplamTutar=(ucret-yasIndirimi-biletTuruIndirimi);
            System.out.println("Toplam Tutar"+toplamTutar+" TL");
        }
        else
        {
            System.out.println("Hatalı veri girdiniz !");
        }
    }
}
