package solid.instagram.cLiskovSubstitution;

import solid.instagram.Utility.Notification;
import solid.instagram.Utility.User;

public abstract class SocialMedia {
	private double kucultmeKatSayisi;

	public double getKucultmeKatSayisi() {
		return kucultmeKatSayisi;
	}

	public void setKucultmeKatSayisi(double kucultmeKatSayisi) {
		this.kucultmeKatSayisi = kucultmeKatSayisi;
	}	
		

	// 2ye bölerek bir metodu Single Responsibility hale getirdik böylede solide
	// örnek oldu
	public void sendEmailNotification(User user) {
		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
	}

	public void sendSmsNotification(User user) {
		if (user.getPhone() != null) {
			Notification.sendEmail(user.getPhone());
		}
	}

	public abstract void changeScaleRatio(String type);
}
