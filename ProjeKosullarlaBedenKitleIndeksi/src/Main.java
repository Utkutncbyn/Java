import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Girin: ");
        int kilo = scanner.nextInt();

        System.out.print("Lütfen Boyunuzu Girin: ");
        double boy = scanner.nextDouble();
        
        float indeks = (float) (kilo / (boy * boy));
        
        if (indeks < 18.5) {
            System.out.println("Zayıf " + indeks);
        }

        else if (indeks >= 18.5 && indeks <= 25) {
            System.out.println("Normal " + indeks);
        }

        else {
            System.out.println("Kilolu " + indeks);
        }

    }

}
