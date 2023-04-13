package OOP.stackPalindrome;

import java.util.Scanner;
import java.util.Stack;

public class PalindromStackFailDenemem {

	public static void main(String[] args) {
		Stack<Character> kelimeStack2 = new Stack<>();
		Stack<Character> kelimeStack = new Stack<>();
		Stack<Character> kelimeStackFake = new Stack<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Palindrome denenicek kelimeyi giriniz: ");

		String kelime = input.nextLine();
		for (int i = 0; i < kelime.length(); i++) {
			char a = kelime.charAt(i);
			kelimeStack.push(a);

		}
		for (int i = 0; i < kelime.length(); i++) {
			char a = kelime.charAt(i);
			kelimeStackFake.push(a);

		}

		while (!kelimeStack.isEmpty()) {
			char a = kelimeStack.pop();
			kelimeStack2.push(a);
		}

//		for (int i = 0; i < kelimeStack.size(); i++) {
//			
//			kelimeStack2.push(kelimeStack.get(i));
//		}

		for (int i = 0; i < kelimeStack2.size(); i++) {
			if (kelimeStack2.get(i) == kelimeStackFake.get(i)) {
				System.out.println(kelimeStackFake + " esittir " + kelimeStack2 + " bu bir palindromedur");
			} else
				System.out.println(kelimeStackFake + " esit degildir " + kelimeStack2 + " ye bu bir palindrome degildir");
		}

	}

}
