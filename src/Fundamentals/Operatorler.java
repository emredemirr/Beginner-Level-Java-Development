/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Fundamentals;

public class Operatorler
{
    public static void main(String[] args) {
        int a = 5,b = 1, c = 5;
        boolean kosul1 = a==c;
        boolean kosul2 = a>=c;

        boolean sonuc = kosul1 || kosul2;
        boolean sonuc2 = !((a==c)||(a>=b));

        String str = sonuc ? "Doğru" : "Yanlış";

        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(sonuc);
        System.out.println(sonuc2);
        System.out.println(str);
    }
}
