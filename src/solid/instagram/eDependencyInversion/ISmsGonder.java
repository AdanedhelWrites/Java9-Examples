package solid.instagram.eDependencyInversion;

import solid.instagram.Utility.User;

public interface ISmsGonder {
	void sendSmsNotification(User user);
}
