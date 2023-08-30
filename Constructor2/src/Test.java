public class Test {

    public static void main(String[] args) {

        Account account1 = new Account();
        Account account2 = new Account("Utku","utkutuncabayn@gmail.com","05344532549");
        Account account3 = new Account("123456",2000,"Ahmet","Ahmet@gmail.com","055544443322");

        account1.bilgileriGoster();
        System.out.println("\n");
        account2.bilgileriGoster();
        System.out.println("\n");
        account3.bilgileriGoster();


    }
}
