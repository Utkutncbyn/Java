import java.util.Scanner;

public class Main {

    public static int EbobBulma(int sayi1, int sayi2) {

        int ebob = 0;

        for (int i = 2; i <= sayi1 && i <= sayi2; i++ ) {

            if (sayi1 % i ==0 && sayi2 % i == 0) {

                ebob = i;
            }
        }
    return ebob;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk Sayıyı Girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci Sayıyı Girin: ");
        int sayi2 = scanner.nextInt();

        System.out.println("Bu Sayıların Ebobu: " + EbobBulma(sayi1,sayi2));
    }
}
