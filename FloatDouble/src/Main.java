public class Main {
    public static void main(String[] args) {
        // Double : 64 bit - 8 byte
        // Float : 32 bit - 4 byte

        // Otomatik Dönüştürme : int --> float --> double

        /*
        int a = 22/7;
        float b = 22f/7f;
        double c = 22d/7d;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
         */

        /*
        double i = 3.52;
        float j = (float)i;
         */

        double sayı1 = 70.25;
        double sayı2 = 60d;
        double sayı3 = 80.2;

        float a = 70.25f;
        float b = 60f;
        float c = 80.2f;

        System.out.println("Ortalama = " + (sayı1 + sayı2 + sayı3) / 3);
        System.out.println("Ortalama = " + (a + b + c) / 3);
    }

}
