package solid.instagram.bOpenClosed;

public class Facebook extends SocialMedia{

	@Override
	public void changeScaleRatio(String type) {
		// TODO Auto-generated method stub
		if (type.equalsIgnoreCase("jpg")) {
			setKucultmeKatSayisi(38);
		}else if (type.equalsIgnoreCase("png")) {
			setKucultmeKatSayisi(30);
		}else
			setKucultmeKatSayisi(45);
	}

	
	
	
	
	
}
