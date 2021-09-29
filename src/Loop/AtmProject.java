package Loop;
import java.util.Scanner;
public class AtmProject
{
    public static void main(String[] args) {

        String userName,password;
        int right=3, price;
        int select, balance =1500;
        Scanner input = new Scanner(System.in);

        while(right>0)
        {
            System.out.print("Kullanıcı Adı: ");
            userName = input.nextLine();
            System.out.print("Şifre: ");
            password = input.nextLine();
            if (userName.equals("emre") && password.equals("123"))
            {
                do
                {
                    System.out.println("Giriş Başarılı.");
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select =input.nextInt();
                    switch (select)
                    {
                        case 1:
                            System.out.println("Para Miktarı: ");
                            price = input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.println("Çekilecek Miktar: ");
                            price = input.nextInt();
                            if (balance<price)
                            {
                                System.out.println("Yetersiz Bakiye");
                            }
                            else
                            {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere");
                            break;
                        default:
                    }
                }
                while (select!=4);

                break;

            }
            else
            {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar Deneyiniz!");
                if (right==0)
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                else
                    System.out.println("Hatalı giriş\nKalan Hakkınız"+ right);
            }
        }

    }


}
