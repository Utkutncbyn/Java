import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /*
        Account account1 = new Account();
        Scanner scanner = new Scanner(System.in);

        account1.setHesapNo("123456");
        account1.setBakiye(1000);
        account1.setIsim("Utku");
        account1.setEmail("utkutuncabayn@gmail.com");
        account1.setTelefonNo("05344532549");

        System.out.println("Bakiye: " + account1.getBakiye());

         */

        Account account2 = new Account("123456", 2000, "Utku", "utkutuncabayn@gmail.com", "05344532549");

        account2.paraYatir(500);
        account2.paraCekme(2500);
    }
}
