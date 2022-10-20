/*
 *  Link       : https://app.patika.dev/courses/java101/string-sinifi
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Other;

public class StringClass
{
    public static void main(String[] args)
    {
        String str = "deneme";

        // Belirtilen indisteki karakteri verir.
        System.out.println(str.charAt(1));

        // Belirtilen indisteki karakterin unicode'unu verir.
        System.out.println(str.codePointAt(1));

        // Belirtilen indisteki önceki karakterin unicode'unu verir.
        System.out.println(str.codePointBefore(1));

        // Bu dizenin belirtilen metin aralığındaki Unicode'u döndürür.
        System.out.println(str.codePointCount(1,3));

        // İki dizeyi sözlükbilimsel olarak karşılaştırır.
        System.out.println(str.compareTo(str));

        // Büyük / Küçük harf farklılıklarını göz ardı ederek iki dizeyi sözlükbilimsel olarak karşılaştırır.
        System.out.println(str.compareToIgnoreCase(" "));

        //Başka bir String'in sonuna bir karakter ekler.
        System.out.println(str.concat(" "));

        //Bir dizenin bir dizi karakter içerip içermediğini kontrol eder.
        System.out.println(str.contains(" "));

        // Bir dizenin belirtilen CharSequence ve StringBuffer ile aynı karakter dizisini içerip içermediğini kontrol eder.
        System.out.println(str.contentEquals(" "));

        // Bir dizenin belirtilen karakterler ile bitip bitmediğini kontrol eder.
        System.out.println(str.endsWith(" "));

        // Karakter dizisinin karakterlerini temsil eden bir dizi döndürür.
        System.out.println(str.copyValueOf());

        // İki stringi karşılaştırır. Eşitse true, değilse false döndürür.
        System.out.println(str.equals("patika"));

        // Büyük / Küçük dikkate almadan iki stringi karşılaştırır.
        System.out.println(str.equalsIgnoreCase("PaTikA"));

        // Bu stringi adlandırılmış karakter kümesini kullanarak bir bayt dizisinde kodlar, sonucu yeni bir bayt dizisine saklar.
        System.out.println(str.getBytes());

        // Karakterleri bir dizeden bir karakter dizisine kopyalar
        System.out.println(str.getChars());

        // Bir dizenin karma kodunu veri
        System.out.println(str.hashCode());

        // Bir dizede belirtilen karakterlerin ilk bulunan oluşumunun konumunu verir
        System.out.println(str.indexOf(4));

        // Aramayı belirtilen dizinde başlatarak, belirtilen karakterin ilk oluşumunun bu dizge içindeki dizini döndürür
        System.out.println(str.intern());

        // Bir dizenin boş olup olmadığını kontrol eder
        System.out.println(str.isEmpty());

        // Bir dizede belirtilen karakterlerin son bulunan oluşumunun konumunu verir
        System.out.println(str.lastIndexOf(2));

        // Belirtilen bir dizenin uzunluğunu verir
        System.out.println(str.length());

        // Normal bir ifadeye karşı bir eşleşme için bir dize arar ve eşleşmeleri döndürür
        System.out.println(str.matches(" "));

        // CodePointOffset kod noktaları tarafından verilen dizinden uzak olan bu Dize içindeki dizini döndürür
        System.out.println(str.offsetByCodePoints(1,3));

        // İki dizi bölgesinin eşit olup olmadığını test eder
        System.out.println(str.regionMatches(1," ",2,3));

        // Belirli bir değer için bir dize arar ve belirtilen değerlerin değiştirildiği yeni bir dize döndürür
        System.out.println(str.replace("p","v"));

        // Verilen normal ifadeyle eşleşen bir alt dizenin ilk oluşumunu verilen değiştirmeyle değiştirir
        System.out.println(str.replaceFirst(" "," "));

        // Verilen normal ifadeyle eşleşen bu dizenin her bir alt dizesini verilen değiştirmeyle değiştirir
        System.out.println(str.replaceAll(" "," "));

        // Bir dizeyi bir alt dizeye böler
        System.out.println(str.split("pat"));

        // Bir dizenin belirtilen karakterlerle başlayıp başlamadığını kontrol eder
        System.out.println(str.startsWith("p"));

        // Bu dizinin bir alt dizisi olan yeni bir karakter dizisi verir
        System.out.println(str.subSequence(2,3));

        // Karakterleri bir dizeden, belirtilen bir başlangıç konumundan başlayarak ve belirtilen karakter sayısıyla ayıklar
        System.out.println(str.substring(2));

        // Bu dizeyi yeni bir karakter dizisine dönüştürür
        System.out.println(str.toCharArray());

        // Bir dizeyi küçük harflere dönüştürür
        System.out.println(str.toLowerCase());

        // Bir String nesnesinin değerini verir
        System.out.println(str.toString());

        // Bir dizeyi büyük harflere dönüştürür
        System.out.println(str.toUpperCase());

        // Bir dizenin her iki ucundaki boşluğu kaldınır
        System.out.println(str.trim());

        // Bir String nesnesinin ilkel değerini verir
        System.out.println(str.valueOf(2));

        // Belirtilen yerel ayarı, biçim dizesini ve bağımsız değişkenleri kullanarak biçimlendirilmiş bir dize döndürür
        System.out.println(str.format(" "));

    }
}
