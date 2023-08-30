import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int bakiye = 12000;

        String islemler = "1. İşlem: Bakiye Öğrenme\n"
                + "2. İşlem: Para Çekme\n"
                + "3. İşlem: Para Yatırma\n"
                + "Çıkış için q'a basın";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Şifrenizi Girin: ");
        int sifre = scanner.nextInt();


        if (sifre == 2601) {

            System.out.println("************************");
            System.out.println(islemler);
            System.out.println("************************");
            scanner.nextLine();
            String secim = scanner.nextLine();

            switch (secim) {

                case "1":

                    System.out.println("Mevcut Bakiyeniz: " + bakiye);
                    break;

                case "2":

                    System.out.print("Çekmek İstediğiniz Tutarı Girin: ");
                    int yatirilan_tutar = scanner.nextInt();
                    bakiye -= yatirilan_tutar;
                    System.out.println("Çekilen Tutar: " + yatirilan_tutar + "\n" + "Yeni Bakiyeniz: " + bakiye);
                    break;

                case "3":

                    System.out.print("Yatırmak İstediğiniz Tutarı Girin: ");
                    int cekilen_tutar = scanner.nextInt();
                    bakiye += cekilen_tutar;
                    System.out.println("Çekilen Tutar: " + cekilen_tutar + "\n" + "Yeni Bakiyeniz: " + bakiye);
                    break;

                case "q":

                    System.out.println("Çıkışınız Yapılıyor...");
                    break;

                default:

                    System.out.println("Geçersiz işlem...");
            }
        }
        else{
                System.out.println("Yanlış Giriş Bilgileri...");
            }

    }

}


