package threadgiris.synch;

public class TestHesap {
	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				Hesap.paraCek(100);
			}
		});
		Thread th2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				Hesap.paraYatir(100);
			}
		});
		th1.start();
		th2.start();

		th1.join();
		th2.join();

		System.out.println("Hesaptaki para: " + Hesap.bakiye);
	}
}
