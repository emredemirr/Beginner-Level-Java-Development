package TemelKavramlar;
import java.util.Scanner;
public class ManavKasa
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        System.out.print("Kaç Kilo Armut Aldın? : ");
        armutKg = input.nextDouble();
        System.out.print("Kaç Kilo Elma Aldın? : ");
        elmaKg = input.nextDouble();
        System.out.print("Kaç Kilo Domates Aldın? : ");
        domatesKg = input.nextDouble();
        System.out.print("Kaç Kilo Muz Aldın? : ");
        muzKg = input.nextDouble();
        System.out.print("Kaç Kilo Patlıcan Aldın? : ");
        patlicanKg = input.nextDouble();

        double tutar = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
        System.out.println("Toplam Tutar: "+tutar);
    }
}
