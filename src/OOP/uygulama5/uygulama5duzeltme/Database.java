package OOP.uygulama5.uygulama5duzeltme;

public abstract class Database {

	String username;
	String password;

	public abstract void ekle();

	public abstract void sil();

	public abstract void verileriGetir();

	public abstract void guncelle();

	public abstract void login();

}
