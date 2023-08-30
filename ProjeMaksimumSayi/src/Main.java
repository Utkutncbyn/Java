import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen İlk Sayıyı Giriniz: ");
        int ilk_sayi = scanner.nextInt();

        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        int ikinci_sayi = scanner.nextInt();

        System.out.print("Lütfen Üçüncü Sayıyı Giriniz: ");
        int üçüncü_sayi = scanner.nextInt();

        if (ilk_sayi >= ikinci_sayi && ilk_sayi >= üçüncü_sayi) {
            System.out.println("En Büyük Sayı: " + ilk_sayi);
        }

        else if (ikinci_sayi >= ilk_sayi && ikinci_sayi >= üçüncü_sayi)
            System.out.println("En Büyük Sayı: " + ikinci_sayi);

        else {
            System.out.println("En Büyük Sayı: " + üçüncü_sayi);
        }

    }

}