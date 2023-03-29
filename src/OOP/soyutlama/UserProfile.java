package OOP.soyutlama;

public class UserProfile {
	int id;
	String avatar;
	String username;
	int takipSayisi;
	int takipci;	
	Post[] postlar;
	int postSayisi;
	
	
	public void profilDuzenle() {
		System.out.println("Profil Düzenlendi.");
	}
	
	public void postOlustur() {
		System.out.println("Post Olusturuldu.");
	}
}
