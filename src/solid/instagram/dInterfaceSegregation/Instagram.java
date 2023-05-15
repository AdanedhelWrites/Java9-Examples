package solid.instagram.dInterfaceSegregation;

/*
 * OpenClosed
 * 1--> Resim boyutlandırma sınıfımız olacak bu metot bizden bir instagramı alacak birde String type alcak
 * işlemler yapacak eğer type jpg ise kücültme katsayısı 38 eğer png ise 30 olsun
 * 
 * 2--> Whatsapp sadece video konfretans , sohbet , resimPaylas, hikaye paylas özelliklerini destekliyor
 * 3--> Facebook post atar resim hikaye paylasır sohbet edemez
 * 4--> Instagram post atar resim hikaye paylasir sohbet eder
 */

public class Instagram extends SocialMedia implements IEmailGonder,ISmsGonder,ISharePost,ISharePhoto,IShareStory,IChat{

	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setKucultmeKatSayisi(38);
		} else if (type.equalsIgnoreCase("png")) {
			setKucultmeKatSayisi(30);
		} else
			setKucultmeKatSayisi(15);
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shareStory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sharePhoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sharePost() {
		// TODO Auto-generated method stub
		
	}

}
