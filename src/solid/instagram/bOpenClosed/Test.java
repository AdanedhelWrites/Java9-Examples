package solid.instagram.bOpenClosed;

public class Test {
	public static void main(String[] args) {
		Instagram insta = new Instagram();
		Facebook fb = new Facebook();
		Whatsapp wp = new Whatsapp();
		
		insta.changeScaleRatio("jpg");
		System.out.println(insta.getKucultmeKatSayisi()); 
		fb.changeScaleRatio("jpg");
		System.out.println(fb.getKucultmeKatSayisi()); 
		wp.changeScaleRatio("jpg");
		System.out.println(wp.getKucultmeKatSayisi()); 
		
	}
}
