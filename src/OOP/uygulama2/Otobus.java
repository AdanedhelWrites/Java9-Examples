package OOP.uygulama2;

public class Otobus {
	private String otobusNo;
	private String plaka;	
	private String soforIsmi;
	private Guzergah guzergah;
	private int yolcuKapasitesi;
	private String marka;
	public Otobus(String otobusNo, String plaka, String soforIsmi, Guzergah guzergah, int yolcuKapasitesi,
			String marka) {
		super();
		this.otobusNo = otobusNo;
		this.plaka = plaka;
		this.soforIsmi = soforIsmi;
		this.guzergah = guzergah;
		this.yolcuKapasitesi = yolcuKapasitesi;
		this.marka = marka;
	}
	public Otobus(String otobusNo, String plaka, String soforIsmi, int yolcuKapasitesi, String marka) {
		super();
		this.otobusNo = otobusNo;
		this.plaka = plaka;
		this.soforIsmi = soforIsmi;
		this.yolcuKapasitesi = yolcuKapasitesi;
		this.marka = marka;
	}
	public String getOtobusNo() {
		return otobusNo;
	}
	public void setOtobusNo(String otobusNo) {
		this.otobusNo = otobusNo;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public String getSoforIsmi() {
		return soforIsmi;
	}
	public void setSoforIsmi(String soforIsmi) {
		this.soforIsmi = soforIsmi;
	}
	public Guzergah getGuzergah() {
		return guzergah;
	}
	public void setGuzergah(Guzergah guzergah) {
		this.guzergah = guzergah;
	}
	public int getYolcuKapasitesi() {
		return yolcuKapasitesi;
	}
	public void setYolcuKapasitesi(int yolcuKapasitesi) {
		this.yolcuKapasitesi = yolcuKapasitesi;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	@Override
	public String toString() {
		return "Otobus [otobusNo=" + otobusNo + ", plaka=" + plaka + ", soforIsmi=" + soforIsmi + ", guzergah="
				+ guzergah + ", yolcuKapasitesi=" + yolcuKapasitesi + ", marka=" + marka + "]";
	}
	
	
}
