import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        double kilo = scanner.nextDouble();

        System.out.print("Lütfen Boyunuzu Giriniz: ");
        double boy = scanner.nextDouble();

        double indeks = kilo / (boy*boy);
        System.out.print("BKI Değeriniz: " + indeks);
    }
}
