package solid.instagram.eDependencyInversion;

import solid.instagram.Utility.User;

public interface IEmailGonder {
	void sendEmailNotification(User user);
}
