package solid.instagram.bOpenClosed;

public class Whatsapp extends SocialMedia{
	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setKucultmeKatSayisi(28);
		} else if (type.equalsIgnoreCase("png")) {
			setKucultmeKatSayisi(32);
		} else
			setKucultmeKatSayisi(36);
	}
}
