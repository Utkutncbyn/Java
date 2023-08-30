import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        System.out.print("Basamak Giriniz: ");
        int basamak_sayisi = scanner.nextInt();

        int gecici_sayi = sayi;
        int toplam = 0;

        do {

            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;

            toplam += Math.pow(basamak_degeri,basamak_sayisi);

        } while(gecici_sayi > 0 );

        if (sayi == toplam) {

            System.out.println("Bu sayı Armstrong sayısıdır...");

        }

        else {

            System.out.println("Bu sayı Armstrong sayısı değil...");

        }
    }
}
