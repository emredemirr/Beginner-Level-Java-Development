package TemelKavramlar;
import java.util.Scanner;


public class KdvHesaplama
{
    public static void main(String[] args)
    {
        float tutar,kdvOrani,Fiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Tutarını Giriniz: ");
        tutar = input.nextFloat();
        kdvOrani = (tutar/100)*18;
        Fiyat = tutar+kdvOrani;
        System.out.println("Ürün Fiyatı: "+ Fiyat+"TL");
    }
}
