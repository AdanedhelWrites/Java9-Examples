package OOP.uygulama4;

import java.util.ArrayList;

public class MasaustuBilgisayar extends Bilgisayar {
	
	private int kasaBoyutu;
	private Monitor monitor;	
	
	public MasaustuBilgisayar(String id, String ad, Anakart anakart, ArrayList<HariciDonanim> hariciDonanimlar,
			int kasaBoyutu, Monitor monitor) {
		super(id, ad, anakart, hariciDonanimlar);
		this.kasaBoyutu = kasaBoyutu;
		this.monitor = monitor;
		setTasinabilirMi(false);
	}
	public MasaustuBilgisayar(String id, String ad, Anakart anakart, int kasaBoyutu, Monitor monitor) {
		super(id, ad, anakart);
		this.kasaBoyutu = kasaBoyutu;
		this.monitor = monitor;
		setTasinabilirMi(false);
	}
	public int getKasaBoyutu() {
		return kasaBoyutu;
	}
	public void setKasaBoyutu(int kasaBoyutu) {
		this.kasaBoyutu = kasaBoyutu;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	
	
	
}
