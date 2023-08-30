import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        System.out.println("Beyblade Programına Hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basın");

        while (true) {
            System.out.print("Hangi Beyblade'i Üretmek İstiyorsunuz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else {
                BeybladeFabrikası fabrika = new BeybladeFabrikası();
                Beyblade beyblade = fabrika.beybladeUret(islem);

                if(beyblade == null){
                    System.out.println("Lütfen Geçerli Bir Beyblade İsmi Girin");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
