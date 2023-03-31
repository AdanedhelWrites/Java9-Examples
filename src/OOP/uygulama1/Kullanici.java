package OOP.uygulama1;

public class Kullanici {
	int userId;	
	private String username;
	private String email;
	private String sifre;
	private String isim;
	private String info;
	
	
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
	
	public Kullanici(String isim,String username,String email, String sifre) {
		
		this.isim=isim;
		this.username=username;
		this.email=email;
		this.sifre=sifre;
		
	}
	
	public int getUserId() {
		
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;				
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
}
