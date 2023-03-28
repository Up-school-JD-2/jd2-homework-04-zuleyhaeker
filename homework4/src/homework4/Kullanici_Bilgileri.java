package homework4;

public class Kullanici_Bilgileri {
    private String ad;
    private String soyad;

    public Kullanici_Bilgileri(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }
    public void kullanıcı(){
        System.out.println();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

}
