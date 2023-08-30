import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {

        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza Hoşgeldiniz...");

        System.out.println("**************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("**************************");

        int giris_hakki = 3;

        // Login Check
        while (true) {
            if (login.Login(hesap)){
                System.out.println("Giriş Başarılı");
                break;
            }
            else {
                giris_hakki -= 1;
                System.out.println("Giriş Başarısız | Klan Giriş Hakkı: " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Giriş Hakkınız Kalmadı");

                break;
            }
        }

        System.out.println("**************************");
        String islemler = "1. Bakiye Görüntüle\n"
                            + "2. Para Yatırma\n"
                            + "3. Para Çekme\n"
                            + "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("**************************");

        // ATM Functions
        while (true) {

            System.out.println("İşleminizi Seçin");
            String islem = scanner.nextLine();

            if (islem.equals("q")){

                break;
            }
            else if (islem.equals("1")){

                System.out.print("Bakiyeniz: " + hesap.getBakiye() + "\n");
            }
            else if (islem.equals("2")){

                System.out.println("Yatırmak İstediğiniz Tutarı Giriniz: ");
                double miktar = scanner.nextDouble();
                scanner.nextLine();

                hesap.paraYatir(miktar);
            }
            else if (islem.equals("3")){

                System.out.println("Çekmek İstediğiniz Tutarı Giriniz: ");
                double miktar = scanner.nextDouble();
                scanner.nextLine();

                hesap.paraCekme(miktar);
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }
        }
    }
}
