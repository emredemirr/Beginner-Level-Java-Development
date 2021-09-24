package ConditionalExpressions;
import java.util.Scanner;
public class Login
{
    public static void main(String[] args)
    {
        String userName,password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifre: ");
        password = input.nextLine();

        if (userName.equals("emredemir")&& password.equals("1234"))
        {
            System.out.println("Giriş Yapıldı.");
        }
        else
        {
            System.out.println("Bilgiler yanlış");
        }

    }
}
