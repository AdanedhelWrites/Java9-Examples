package solid.instagram.cLiskovSubstitution;

public class Facebook extends SocialMedia implements IEmailGonder,ISmsGonder,ISharePost,ISharePhoto,IShareStory{
//3--> Facebook post atar resim hikaye paylasır sohbet edemez
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
