package homework4;

public class Sarkilar {
	  private String sarki_adi;
	    private String sanatcisi;
	    private String albümü;
	    private String uzunluğu;
	    private int fiyat;

	 

	    public Sarkilar(String sarki_adi, String sanatcisi, String albümü, String uzunluğu,int fiyat){
	        this.sarki_adi = sarki_adi;
	        this.sanatcisi = sanatcisi;
	        this.albümü = albümü;
	        this.uzunluğu=uzunluğu;
	        this.fiyat=fiyat;


	    }

	    private Album album;

	    public String getSarki_adi() {
	        return sarki_adi;
	    }

	    public void setSarki_adi(String sarki_adi) {
	        this.sarki_adi = sarki_adi;
	    }

	    public String getSanatcisi() {
	        return sanatcisi;
	    }

	    public void setSanatcisi(String sanatcisi) {
	        this.sanatcisi = sanatcisi;
	    }

	    public String getAlbümü() {
	        return albümü;
	    }

	    public void setAlbümü(String albümü) {
	        this.albümü = albümü;
	    }

	    public String getUzunluğu() {
	        return uzunluğu;
	    }

	    public void setUzunluğu(String uzunluğu) {
	        this.uzunluğu = uzunluğu;
	    }
	    
	    public int getFiyat() {
	        return fiyat;
	    }

	    public void setFiyat(int fiyat) {
	        this.fiyat = fiyat;
	    }

}
