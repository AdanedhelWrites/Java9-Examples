package OOP.stackParaSayma;

import java.util.Stack;

public class ParaSayma {
	public static void main(String[] args) {
		Stack<Integer> sayiStack = new Stack<>();
		sayiStack.push(50);
		sayiStack.push(150);
		sayiStack.push(60);//PUSH DEGERİN EKNDISINI DONER ADD BOOLEAN DEGER DONER
		sayiStack.push(178);
		sayiStack.push(120);
		sayiStack.push(101);
		sayiStack.push(5);
		Stack<Integer> kucukSayiStack = new Stack<>();
		int top = 0;
		
			
		while (!sayiStack.isEmpty()) {
			int para = sayiStack.peek();
			if (para >= 100) {
				top += sayiStack.pop();
			}else {
				kucukSayiStack.push(sayiStack.pop());
			}
		}
		kucukSayiStack.forEach(System.out::println);
		System.out.println("*********************");
		kucukSayiStack.forEach((x) -> System.out.println(x));
		System.out.println("Kucuk sayi stack:" +kucukSayiStack);			
		System.out.println("100'den buyuklerin toplami: "+ top);
		
	}
}
