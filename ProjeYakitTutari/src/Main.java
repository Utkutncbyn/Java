import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Aracınız Kilometrede Kaç Kuruş Yakıyor: ");
        double kuruş = scanner.nextDouble();

        System.out.print("Aracınızla Kaç Kilometre Gittiniz: ");
        int km = scanner.nextInt();

        System.out.print("Toplam Ödemeniz Gereken Tutar: " + (kuruş * km) + " TL");
    }
}
