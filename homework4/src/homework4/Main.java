package homework4;

public class Main {
	public static void main(String[] args) {

    Sarkilar sarki1=new Sarkilar("sarmaşık","mabel matiz","maya","3.15",100);
    Sarkilar sarki2=new Sarkilar("boyalıda saçların","mabel matiz","maya","4.00",100);

  Album  album =new Album();
  album.addSarkilar(sarki1);
  album.addSarkilar(sarki2);

  Kullanici_Bilgileri kullanıcı=new Kullanici_Bilgileri("züleyha","eker");
    
    System.out.println("Kullanıcı " + kullanıcı.getAd()+" " +kullanıcı.getSoyad());
    System.out.println("******************************");



  album.printAllSongs();
  
  Sepet sepet= new Sepet();
  //şarkıyı sepete ekledik.
  sepet.addSepeteSarki("sarmaşık");


    //addSarkilar("sarmaşık");
   // addSarkilar("mabel");

}

}
