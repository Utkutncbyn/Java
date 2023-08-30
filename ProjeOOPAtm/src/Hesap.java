public class Hesap {

    private String kullanici_adi;
    private String parola;
    private int bakiye;

    // Constructors
    //***********************************
    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    // Custom Functions
    //***********************************
    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println("Yeni Bakiyeniz: " + bakiye);
    }
    //***********************************
    public void paraCekme(double miktar) {
        if (miktar > 6500) {
            System.out.println("Günlük Para Çekme Limitiniz 6500 TL...");
        }
        else if ((bakiye-miktar) < 0 ){
            System.out.println("Yetersiz Bakiye...");
        }
        else {
            bakiye -= miktar;
            System.out.println("Yeni Bakiyeniz: " + bakiye);
        }
    }

    // Getter && Setter Functions
    //***********************************
    public String getKullanici_adi() {
        return kullanici_adi;
    }
    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }
    //***********************************
    public String getParola() {
        return parola;
    }
    public void setParola(String parola) {
        this.parola = parola;
    }
    //***********************************
    public int getBakiye() {
        return bakiye;
    }
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}
