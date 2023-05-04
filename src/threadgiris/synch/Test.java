package threadgiris.synch;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		Thread th1 = new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				Product.urunSat();
			}
		});
		Thread th2 = new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				Product.urunSat();
			}
		}); 
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println(Product.stock);
	}
}
