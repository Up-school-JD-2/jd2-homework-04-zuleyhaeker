package homework4;

public class Album {
	 private String album_adi;
	    private String sanatci_adi;
	    private int album_yayin_tarihi;
	    private Sarkilar[] sarkilar = new Sarkilar[2];
	    private int sarkiCount = 0;
	   
	    public String addSarkilar(Sarkilar sarki) {
	        sarkilar[sarkiCount] = sarki;
	        sarkiCount++;
	        return "sarkılar albüme eklendi.";
	    }
	    public void printAllSongs() {
	        System.out.println("Sarkı Listesi");
	        for (int i = 0; i < sarkiCount; i++) {
	           Sarkilar sarki = sarkilar[i];
	            System.out.println("Sarkı adı: " + sarki.getSarki_adi());
	            System.out.println("Albümü: " + sarki.getAlbümü());
	            System.out.println("Sanatçısı: " + sarki.getSanatcisi());
	            System.out.println("Uzunluğu: " + sarki.getUzunluğu());
	            System.out.println("Fiyatı: " + sarki.getFiyat());
	            System.out.println("******************************");

	        }
	        System.out.println("Toplam Fiyat :" + toplamFiyat());
	        System.out.println("****************************");

	    }

	    private double toplamFiyat() {
	        double toplam = 0;
	        for (int i = 0 ; i<sarkiCount ; i++){
	            toplam += sarkilar[i].getFiyat();
	        }
	        return toplam;
	    }

	    public String getAlbum_adi() {
	        return album_adi;
	    }

	    public void setAlbum_adi(String album_adi) {
	        this.album_adi = album_adi;
	    }

	    public String getSanatci_adi() {
	        return sanatci_adi;
	    }

	    public void setSanatci_adi(String sanatci_adi) {
	        this.sanatci_adi = sanatci_adi;
	    }

	    public int getAlbum_yayin_tarihi() {
	        return album_yayin_tarihi;
	    }

	    public void setAlbum_yayin_tarihi(int album_yayin_tarihi) {
	        this.album_yayin_tarihi = album_yayin_tarihi;
	    }

}
