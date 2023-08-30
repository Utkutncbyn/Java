import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Kenar: ");
        a = scanner.nextInt();

        System.out.print("İkinci Kenar: ");
        b = scanner.nextInt();

        double h = Math.sqrt(a*a + b*b);

        System.out.print("Hipotenüs: " + h );

    }
}
