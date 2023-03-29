package OOP.uygulama1;

public class Kullanici {
	int userId;	
	public String username;
	public String email;
	public String sifre;
	public String isim;
	public String info;
	
	
	public Kullanici() {
		// TODO Auto-generated constructor stub
	}		
	
	public Kullanici(int userId, String username, String email, String sifre, String info) {		
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.sifre = sifre;
		this.info = info;
	}

	public Kullanici(int userId,String isim,String username,String email, String sifre,String info) {
		this.userId=userId;
		this.isim=isim;
		this.username=username;
		this.email=email;
		this.sifre=sifre;
		this.info=info;
	}
	
	
	
}
