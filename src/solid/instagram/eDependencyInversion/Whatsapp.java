package solid.instagram.eDependencyInversion;

import solid.instagram.Utility.Notification;
import solid.instagram.Utility.User;
import solid.instagram.eDependencyInversion.databaselogger.exception.SharePhotoException;

import solid.instagram.eDependencyInversion.databaselogger.exception.VideoException;
//Whatsapp sadece video konfretans , sohbet , resimPaylas, hikaye paylas özelliklerini destekliyor
public class Whatsapp extends SocialMedia implements IEmailGonder,IVideoConferencing,IChat,ISharePhoto{
	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setKucultmeKatSayisi(28);
		} else if (type.equalsIgnoreCase("png")) {
			setKucultmeKatSayisi(32);
		} else
			setKucultmeKatSayisi(36);
	}

	@Override
	public void sendEmailNotification(User user) {
		// TODO Auto-generated method stub
		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
	}

	@Override
	public void sharePhoto() {
		// TODO Auto-generated method stub
		throw new SharePhotoException("Hikaye hatasi");
	
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void videoConferencing() {
		// TODO Auto-generated method stub
		throw new VideoException("Video hatasi");
	}

	
}
