import java.util.Scanner;

public class Login {
    public boolean Login(Hesap hesap) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String kullanici_adi = scanner.nextLine();

        System.out.print("Parola: ");
        String parola = scanner.nextLine();

        if (hesap.getKullanici_adi().equals(kullanici_adi)  && hesap.getParola().equals(parola)){

            return true;
        }
        return false;
    }

}
