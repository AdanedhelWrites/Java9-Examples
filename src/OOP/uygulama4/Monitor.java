package OOP.uygulama4;

public class Monitor extends HariciDonanim{
	private int kareHizi;
	private int inc;
	public Monitor(int kareHizi, int inc) {
		super();
		this.kareHizi = kareHizi;
		this.inc = inc;
	}
	public int getKareHizi() {
		return kareHizi;
	}
	public void setKareHizi(int kareHizi) {
		this.kareHizi = kareHizi;
	}
	public int getInc() {
		return inc;
	}
	public void setInc(int inc) {
		this.inc = inc;
	}
	@Override
	public String toString() {
		return "Monitor [kareHizi=" + kareHizi + ", inc=" + inc + "]";
	}
	
	
	
}
