import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String idmanlar = "Geçerli Hareketler...\n"
                            +"Burpee\n"
                            +"Situp\n"
                            +"Pushup\n"
                            +"Squat\n";

        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun");

        System.out.println("Burpee Sayısı: ");
        int burpee = scanner.nextInt();

        System.out.println("Situp Sayısı: ");
        int situp = scanner.nextInt();

        System.out.println("Pushup Sayısı: ");
        int pushup = scanner.nextInt();

        System.out.println("Squat Sayısı: ");
        int squat = scanner.nextInt();

        scanner.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("İdmanınız Başlıyor...");

        while (idman.idmanBitti() == false) {

            System.out.print("Hareket Türü (Burpee, Pushup, Situp, Squat) : ");
            String tur = scanner.nextLine();

            System.out.print("Bu Hareketten Kaç Tane Yapacaksınız: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();

            idman.hareketYap(tur, sayi);

        }

        System.out.println("Tebrikler Antrenmanı Başarı ile Tamamladınız");


    }
}
