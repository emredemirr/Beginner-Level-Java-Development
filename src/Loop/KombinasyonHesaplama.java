package Loop;
import java.util.Scanner;

public class KombinasyonHesaplama
{
    public static void main(String[] args)
    {
        int elemanSayisi, grupSayisi,nFaktoriyel=1,rFaktoriyel=1,nrFaktoriyel=1, C;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısı(n): ");
        elemanSayisi = input.nextInt();
        System.out.print("Seçim Sayısı(r): ");
        grupSayisi = input.nextInt();

        for (int i = 1;i<=elemanSayisi;i++)
        {
            nFaktoriyel *= i;
        }
        for (int j = 1; j<= grupSayisi ; j++)
        {
            rFaktoriyel *= j;
        }

        for (int k=1;k<=(elemanSayisi-grupSayisi);k++)
        {
            nrFaktoriyel *= k;
        }

        C = nFaktoriyel/(rFaktoriyel*nrFaktoriyel);

        System.out.println("\nKombinasyon:"+C +"\n");
        System.out.println("n!:"+nFaktoriyel+"\nr!: "+rFaktoriyel+"\nn-r!: "+nrFaktoriyel);

    }
}
