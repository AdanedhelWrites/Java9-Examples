package OOP.stackPalindrome;
import java.util.Scanner;
import java.util.Stack;
public class PalindromStack {
	Stack<Character> stack = new Stack<>();
	public static void main(String[] args) {
		PalindromStack palindrome = new PalindromStack();
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz: ");
		String kelime = input.nextLine();
		if (palindrome.isPalindrome(kelime)) {
			System.out.println(kelime +" Palindromedur");
		}else
			System.out.println(kelime + " Palindrome degildir");

	}
	public void stackOlustur(String kelime) {
		for (int i = 0; i < kelime.length(); i++) {
			stack.push(kelime.charAt(i));
		}
	}
	public boolean isPalindrome(String kelime){
		stackOlustur(kelime);
		for (int i = 0; i < kelime.length() / 2; i++) {
			if (stack.pop() != kelime.charAt(i)) {
				return false;
			}
			
		}
		return true;
	}

}
