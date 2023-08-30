public class Main {
    public static boolean AsalBulma(int sayi) {

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {

                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(AsalBulma(14));


    }
}
