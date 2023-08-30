import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double faiz_oranı = 0.06;
        double total_para = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz Faiz Oranı: %6");

        System.out.print("Yatırmak İstediğiniz Tutar: ");
        int para = scanner.nextInt();

        System.out.print("Kaç Yıl Faiz ile Yatırmak İstiyorsunuz: ");
        int faiz = scanner.nextInt();

        total_para += para;

        for (int i = 1; i <= faiz; i++) {

            total_para = (total_para * faiz_oranı) + total_para;
        }

        System.out.println("Total Paranız: " + total_para + "\nKazanç: " + (total_para - para));
    }
}
