import java.util.ArrayList;

public class Sarkicilar {

    private ArrayList<String> sarkici_listesi = new ArrayList<String>();

    public void sarkicilariBastir(){

        System.out.println("Şarkıcı listesinde " + sarkici_listesi.size() + "kişi var");

        for (int i = 0;  i< sarkici_listesi.size(); i++){

            System.out.println((i+1) + ". sıradaki şarkıcı " + sarkici_listesi.get(i));
        }
    }
    public void sarkiciEkle(String isim){

        sarkici_listesi.add(isim);
        System.out.println("Şarkıcı listeye eklendi");
    }
    public void sarkiciGuncelle(String isim, int pozisyon) {

        pozisyon = sarkici_listesi.indexOf(isim);
        sarkici_listesi.set(pozisyon,isim);
        System.out.println("Şarkıcı listesi güncellendi");
    }
    public void sarkiciSil(int pozisyon) {

        String isim = sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        System.out.println(isim + " isimli şarkıcı listeden kaldırıldı");
    }
    public void sarkiciAra(String isim) {

        int pozisyon = sarkici_listesi.indexOf(isim);

        if (pozisyon < 0 ) {
            System.out.println("Aranan şarkıcı bulunamadı");
        }
        else {
            System.out.println(sarkici_listesi.get(pozisyon) + " isimli şarkıcı" + pozisyon + ". sırada");
        }
    }
}
