package threadgiris.taksiApp;

import java.util.*;


public class Durak {	
	private List<Taksi> taksiler;
	static Queue<Integer> musteriKuyrugu;
	
		
	public Durak() {
		taksiler = new ArrayList<>();
		musteriKuyrugu = new LinkedList<>();
		musteriOlustur();
		taksiOlustur();
	}
	public void musteriOlustur() {
		for (int i = 1; i <= 100; i++) {
			musteriKuyrugu.add(i);
		}
	}
	
	public void taksiOlustur() {
		for (int i = 1; i <= 10 ; i++) {
			Taksi taksi = new Taksi(i);
			taksiler.add(taksi);
		}
	}
	public List<Taksi> getTaksiler() {
		return taksiler;
	}
	public void setTaksiler(List<Taksi> taksiler) {
		this.taksiler = taksiler;
	}
	public static Queue<Integer> getMusteriKuyrugu() {
		return musteriKuyrugu;
	}
	public void setMusteriKuyrugu(Queue<Integer> musteriKuyrugu) {
		this.musteriKuyrugu = musteriKuyrugu;
	}
	@Override
	public String toString() {
		return "Durak [taksiler=" + taksiler + ", musteriKuyrugu=" + musteriKuyrugu + "]";
	}
	
	
	
	
}
