public class Idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    // Constructors
    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    // Custom Functions
    public void hareketYap(String hareketTuru, int sayi) {

        if (hareketTuru.equals("Burpee")){
            burpeeYap(sayi);
        }
        else if (hareketTuru.equals("Pushup")) {
            pushupYap(sayi);
        }
        else if (hareketTuru.equals("Situp")) {
            situpYap(sayi);
        }
        else if (hareketTuru.equals("Squat")) {
            squatYap(sayi);
        }
        else {
                System.out.println("Geçersiz Hareket...");
        }
    }
    public void pushupYap(int sayi) {

        if (pushup_sayisi == 0){
            System.out.println("Yapacak pushup kalmadı");
        }
        if (pushup_sayisi - sayi < 0) {
            System.out.println("Hedeflenen pushup sayısını geçtiniz");
            pushup_sayisi = 0;
            System.out.println("Kalan pushup sayısı: " + pushup_sayisi);
        }
        else {
            pushup_sayisi -= sayi;
            System.out.println("Kalan pushup sayısı: " + pushup_sayisi);
        }

    }
    public void burpeeYap(int sayi) {

        if (burpee_sayisi == 0){
            System.out.println("Yapacak burpee kalmadı");
        }
        if (burpee_sayisi - sayi < 0) {
            System.out.println("Hedeflenen burpee sayısını geçtiniz");
            burpee_sayisi = 0;
            System.out.println("Kalan burpee sayısı: " + burpee_sayisi);
        }
        else {
            burpee_sayisi -= sayi;
            System.out.println("Kalan burpee sayısı: " + burpee_sayisi);
        }

    }
    public void situpYap(int sayi) {

        if (situp_sayisi == 0){
            System.out.println("Yapacak situp kalmadı");
        }
        if (situp_sayisi - sayi < 0) {
            System.out.println("Hedeflenen situp sayısını geçtiniz");
            situp_sayisi = 0;
            System.out.println("Kalan situp sayısı: " + situp_sayisi);
        }
        else {
            situp_sayisi -= sayi;
            System.out.println("Kalan situp sayısı: " + situp_sayisi);
        }

    }
    public void squatYap(int sayi) {

        if (squat_sayisi == 0){
            System.out.println("Yapacak squat kalmadı");
        }
        if (squat_sayisi - sayi < 0) {
            System.out.println("Hedeflenen squat sayısını geçtiniz");
            squat_sayisi = 0;
            System.out.println("Kalan squat sayısı: " + squat_sayisi);
        }
        else {
            squat_sayisi -= sayi;
            System.out.println("Kalan squat sayısı: " + squat_sayisi);
        }

    }
    public boolean idmanBitti(){

        return (burpee_sayisi == 0) && (situp_sayisi == 0) && (pushup_sayisi == 0) && (squat_sayisi == 0);
    }

    // Setter && Getter Functions
    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getsquat_sayisi() {
        return squat_sayisi;
    }

    public void setsquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
}
