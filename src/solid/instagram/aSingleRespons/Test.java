package solid.instagram.aSingleRespons;

import solid.instagram.Utility.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("mustafa", "mstf@gmail.com","123123");
		Instagram insta = new Instagram();
		insta.sendNotification(user1);
	}

}
