package solid.instagram.bOpenClosed;

/*
 * OpenClosed
 * 1--> Resim boyutlandırma sınıfımız olacak bu metot bizden bir instagramı alacak birde String type alcak
 * işlemler yapacak eğer type jpg ise kücültme katsayısı 38 eğer png ise 30 olsun
 */

public class Instagram extends SocialMedia {

	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setKucultmeKatSayisi(38);
		} else if (type.equalsIgnoreCase("png")) {
			setKucultmeKatSayisi(30);
		} else
			setKucultmeKatSayisi(15);
	}

}
