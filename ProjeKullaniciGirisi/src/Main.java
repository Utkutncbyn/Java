import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sys_id ="utku_tuncabayin";
        String sys_password = "Solemem12";

        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        while (true) {

            System.out.print("Kullanıcı Adı Girin: ");
            String kullanici_adi = scanner.nextLine();

            System.out.print("Sifre Girin: ");
            String sifre = scanner.nextLine();

            if (kullanici_adi.equals(sys_id) && sifre.equals(sys_password)) {

                System.out.println("Hoşgeldiniz " + kullanici_adi);
                break;
            }

            else if (!kullanici_adi.equals(sys_id) && sifre.equals(sys_password)) {

                giris_hakki -=1;
                System.out.println("Hatalı Kullanıcı Adı\nGiriş Hakkı:" + giris_hakki );
            }

            else if (kullanici_adi.equals(sys_id) && !sifre.equals(sys_password)) {

                giris_hakki -=1;
                System.out.println("Hatalı Şifre\nGiriş Hakkı:" + giris_hakki );
            }

            else if (!kullanici_adi.equals(sys_id) && !sifre.equals(sys_password)) {

                giris_hakki -=1;
                System.out.println("Hatalı Şifre ve Kullanıcı Adı\nGiriş Hakkı:" + giris_hakki );
            }

            if (giris_hakki <= 0) {

                System.out.println("Giriş Deneme Hakkınız Doldu\nLütfen Bekleyin...");
                break;
            }
        }
    }
}
