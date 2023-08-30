import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Yaşınızı Girin");
        int yaş = scanner.nextInt();
        System.out.println("Yaşınız: " + yaş);

        System.out.println("Lütfen Sayı Giriniz");
        double sayı = scanner.nextDouble();
        scanner.nextLine(); // Dummy (Sayıdan sonra String ya da Char alınıyorsa araya atılması lazım !!!)
        System.out.println("Girdiğiniz sayı: " + sayı);

        System.out.println("Lütfen Bir Yazı Giriniz");
        String cümle = scanner.nextLine();
        System.out.println("Girdiğiniz Cümle: " + cümle);
         */

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int sayı = scanner.nextInt();
            System.out.println("Sayı: " + sayı);
        }
        else {
            System.out.println("Lütfen bir sayı giriniz !!!");
        }

    }

}
