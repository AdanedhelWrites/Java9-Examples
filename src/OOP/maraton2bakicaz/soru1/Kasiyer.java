package OOP.maraton2bakicaz.soru1;

public class Kasiyer extends Kisi{

	private double maas;

	public Kasiyer(int id, String ad, double maas) {
		super(id, ad);
		this.maas = maas;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	@Override
	public String toString() {
		return "Kasiyer [maas=" + maas + "]";
	}
	
	
	
}
