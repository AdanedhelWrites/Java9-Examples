package solid.instagram.aSingleRespons;

import solid.instagram.Utility.Notification;
import solid.instagram.Utility.User;
/*
 * sizden bir bildirim gönder metodumuz olsun
 * eğer kullanıcının emaili varsa email göndersin
 * 
 * telefonu varsa sms göndersin hem telefon hem email varsa ikinide göndersin
 * 
 * bildirim göönder metodu() ==> kullanıcı alıcak
 * 
 * sms ==> phoneNo + sms gönderildi
 * email ==> email + email gönderildi
 */

public class Instagram {
	User user;
	public static void main(String[] args) {
		
	}
//	public static void bildirimGonder(User user) {
//		if (user.getPhone() == null && user.getEmail() != null) { // benim cozumdu
//			Notification.emailGonder(user);
//		} else {
//			Notification.smsGonder(user);
//		}
//	}
	public void sendNotification(User user) {
		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());			
		}
		if (user.getPhone() != null) {
			Notification.sendSms(user.getPhone());
		}
	}
	//2ye bölerek bir metodu Single Responsibility hale getirdik böylede solide örnek oldu
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

}
