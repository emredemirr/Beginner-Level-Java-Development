package TemelKavramlar;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class VkiHesaplama
{
    public static void main(String[] args)
    {
        double boy,kilo;
        double vki;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz(kg): ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu Giriniz(m): ");
        boy = input.nextDouble();

        vki = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " +vki);
    }
}
