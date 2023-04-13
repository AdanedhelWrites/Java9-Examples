package OOP.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		Queue<Integer> kuyruk = new LinkedList<>();
		kuyruk.offer(11);
		kuyruk.add(1);
		kuyruk.offer(7);
		kuyruk.offer(14);
		kuyruk.offer(5);
		kuyruk.offer(null);
		
		System.out.println(kuyruk.peek());
		System.out.println("***************");
		while (!kuyruk.isEmpty()) {
			System.out.println(kuyruk.poll());
		}
		
	}

}
