/*
 *  Link       : https://app.patika.dev/courses/java101/math-sinifi
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Other;

public class MathClass
{
    public static void main(String[] args)
    {
        int x =5 , y=2;

        // X'in mutlak değerini verir.
        System.out.println(Math.abs(x));

        // X'in arc kosinüsünü radyan cinsinden verir.
        System.out.println(Math.acos(x));

        // X'in arc sinüsünü radyan cinsinden verir.
        System.out.println(Math.asin(x));

        // X'in arc'ını radyan cinsinden verir.
        System.out.println(Math.atan(x));

        // Dikdörtgen koordinatların (x,y) kutupsal koordinatlara (r,teta) dönüştürülmesinden teta açısını verir.
        System.out.println(Math.atan2(x,y));

        // X'in küp kökünü verir.
        System.out.println(Math.cbrt(x));

        // X'i en yakın tam sayıya yuvarlar.
        System.out.println(Math.ceil(x));

        // İkinci kayan nokta y'nin işaretiyle birlikte ilk kayan nokta x'i verir.
        System.out.println(Math.copySign(x,y));

        // X'in kosinüsünü verir (x radyan cinsindedir).
        System.out.println(Math.cos(x));

        // Çift değerin hiperbolik kosinüsünü verir.
        System.out.println(Math.cosh(x));

        // e üzeri x değerini verir.
        System.out.println(Math.exp(x));

        // e üzeri x değerinin tersini verir.
        System.out.println(Math.expm1(x));

        // En yakın tam sayıya yuvarlanmış x değerini verir
        System.out.println(Math.floor(x));

        // X'te kullanılan yansız üssü verir
        System.out.println(Math.getExponent(x));

        // IEEE 754 standardında belirtildiği gibi x ve y üzerindeki kalan işlemi hesaplar
        System.out.println(Math.IEEEremainder(10.1,12.15));

        // X'in doğal logaritmasini (e tabanında) verir
        System.out.println(Math.log(-150));

        // X'in 10 tabanındaki logaritmasını verir
        System.out.println(Math.log10(x));

        // X ve 1 toplamının doğal logaritmasını (e tabanında) verir
        System.out.println(Math.log1p(x));

        // En yüksek değere sahip sayıyı verir
        System.out.println(Math.max(x,y));

        // En düşük değere sahip sayıyı verir
        System.out.println(Math.min(x,y));

        // X'in y yönünde bitişiğinde değen nokta sayısını verir
        System.out.println(Math.nextAfter(x,y));

        // Pozitif sonsuzluk yönünde x'e bitişik kayan nokta değerini verir
        System.out.println(Math.nextUp(x));

        // X'in değerini y'nin üssüne döndürür
        System.out.println(Math.pow(x,y));

        // 0 ile 1 arasında rastgele bir sayı verir
        System.out.println(Math.random());

        // En yakın tam sayıya yuvarlanmış x değerini verir
        System.out.println(Math.round(x));

        // X'e en yakın ve matematiksel tam sayıya eşit olan çift değeri verir
        System.out.println(Math.rint(x));

        // X'in işaretini verir
        System.out.println(Math.signum(x));

        // X'in sinüsünü verir (x radyan cinsindendir)
        System.out.println(Math.sin(x));

        // Çift değerin hiperbolik sinüsünü verir
        System.out.println(Math.sinh(x));

        // X'in karekökünü verir
        System.out.println(Math.sqrt(x));

        // Bir açının tanjantını verir
        System.out.println(Math.tan(x));

        // Çift değerin hiperbolik tanjantini verir
        System.out.println(Math.tanh(x));

        // Radyan cinsinden ölçülen bir açıyı yakl. derece cinsinden ölçülen eşdeğer açı
        System.out.println(Math.toDegrees(x));

        // Derece cinsinden ölçülen bir açıyı yakl. radyan cinsinden ölçülen açı
        System.out.println(Math.toRadians(x));

        // X'in en az duyarlıklı (ulp) biriminin boyutunu verir
        System.out.println(Math.ulp(x));

    }
}
