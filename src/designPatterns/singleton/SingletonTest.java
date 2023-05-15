package designPatterns.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		MyPostgreConnection myPostgreConnection = MyPostgreConnection.getInstance();
		
		System.out.println(myPostgreConnection);
	}
}
