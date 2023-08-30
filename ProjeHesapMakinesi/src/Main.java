import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************");
        String islemler = "1. Toplama\n"
                        + "2. Çıkarma\n"
                        + "3. Çarpma\n"
                        + "4. Bölme";

        System.out.println(islemler);
        System.out.println("*****************************\n");

        System.out.print("İşlemi Seçiniz: ");
        String islem = scanner.nextLine();

        System.out.print("İlk Sayıyı Girin: ");
        double ilk_sayi = scanner.nextDouble();
        System.out.println("İkinci Sayıyı Girin:");
        double ikinci_sayi = scanner.nextDouble();

        switch (islem) {

            case "1" -> {
                double sonuc = ilk_sayi + ikinci_sayi;
                System.out.println("Toplama: " + (float) sonuc);
            }

            case "2" -> {
                double sonuc2 = ilk_sayi - ikinci_sayi;
                System.out.println("Çıkarma: " + (float) sonuc2);
            }

            case "3" -> {
                double sonuc3 = ilk_sayi * ikinci_sayi;
                System.out.println("Çarpma: " + (float) sonuc3);
            }

            case "4" -> {
                double sonuc4 = ilk_sayi / ikinci_sayi;
                System.out.println("Bölüm: " + (float) sonuc4);
            }
        }
    }
}
