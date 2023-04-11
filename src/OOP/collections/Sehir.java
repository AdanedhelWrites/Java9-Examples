package OOP.collections;

import java.util.Random;

public class Sehir implements ISehir,Comparable<Sehir>{
	private String isim;
	private String plakaKodu;
	private int nufus;		
	
	public Sehir() {
		super();
	}	

	public Sehir(String isim) {
		super();
		this.isim = isim;
		this.nufus = nufusOlustur();
	}		


//	public Sehir(String isim, int index) {
//		super();
//		this.isim = isim;
//		this.plakaKodu = plakaKoduUret(index);
//	}

	public String getIsim() {
		return isim;
	}



	public void setIsim(String isim) {
		this.isim = isim;
	}



	public String getPlakaKodu() {
		return plakaKodu;
	}



	public void setPlakaKodu(String plakaKodu) {
		this.plakaKodu = plakaKodu;
	}



	public int getNufus() {
		return nufus;
	}



	public void setNufus(int nufus) {
		this.nufus = nufus;
	}



	@Override
	public String toString() {
		return "Sehir [isim=" + isim + ", plakaKodu=" + plakaKodu + ", nufus=" + nufus + "]";
	}

	@Override
	public String plakaKoduUret(int index) {
		if (index<9) {
			return "0" + (index+1);
		}
		return index+1+"";
	}

	@Override
	public int nufusOlustur() {
		Random rand = new Random();		
		return rand.nextInt(100000,9999999);
	}

	@Override
	public int compareTo(Sehir o) {
		// TODO Auto-generated method stub
		
		return this.nufus-o.nufus;
	}
	
}
