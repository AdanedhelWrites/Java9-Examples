package OOP.soyutlama;

public class Test {

	public static void main(String[] args) {
		//sinifimizda herhangi bir constructor yoksa default olarak bos constructor gelir..
		// FAKAT HERHANGİ BİR CONSTRUCTOR TANIMLARSAK DEFAULT OLARAK TANIMLANMAYACAKTIR !!!! PARAMETRESİZ CONSTRUCTOR ÇALIŞMAZ HALE GELİR !!!
		Post post = new Post(1,"ilk post");
		System.out.println(post.icerik);
		
		Post post2 = new Post();
		System.out.println(post2.icerik);
		
		Post post3 = new Post(3,"ikinci post",3);
		System.out.println(post3.icerik);
		
		Post post4 = new Post(4,"git",4,"selam.jpg");
		System.out.println(post4.userId);
	}

}
