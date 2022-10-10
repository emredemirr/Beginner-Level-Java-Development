package Methods;

public class PalindromicNumber
{
    static boolean isPalindrom(int number)
    {
        int temp=number, reverseNumber=0, lastNumber;
        while (temp !=0)
        {
            lastNumber = temp %10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            temp /= 10;
        }

        if (number== reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        if (isPalindrom(2552))
            System.out.println("Palindromik Sayıdır");
        else
            System.out.println("Palindrom Sayısı Değil");
    }
}

