import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birinci_sayi;
        int ikinci_sayi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Sayı: ");
        birinci_sayi = scanner.nextInt();

        System.out.print("İkinci Sayı: ");
        ikinci_sayi = scanner.nextInt();

        System.out.println("Değiştirilmeden Önce...");
        System.out.println("Birinci Sayı: " + birinci_sayi + "\nİkinci Sayı: " + ikinci_sayi);

        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;

        System.out.println("Değiştirildikten Sonra...");
        System.out.println("Birinci Sayı: " + birinci_sayi + "\nİkinci Sayı: " + ikinci_sayi);




    }
}
