package OOP;

public class Students {
	public String adi;
	public static int index;
	public int no;
	
	public void kayit() {
	index++;
	no = index;
	System.out.println("\nOgrenci basari ile kayit olmustur " + "\nOgrenci No: " + no + "\nOgrenci Adi: " + adi);
	
}
	public void bilgileriGetir() {
		System.out.println("İsim: "+ adi + "\nNumarasi: " + no + "\n===========");
	}

}
