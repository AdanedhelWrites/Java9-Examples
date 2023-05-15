package solid.instagram.eDependencyInversion;

import solid.instagram.cLiskovSubstitution.ISharePhoto;

public class Twitter extends SocialMedia implements IChat,ISharePost,ISharePhoto{
	
	
	@Override
	public void sharePost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setKucultmeKatSayisi(21);
		} else if (type.equalsIgnoreCase("png")) {
			setKucultmeKatSayisi(14);
		} else
			setKucultmeKatSayisi(6);
		
	}

	@Override
	public void sharePhoto() {
		// TODO Auto-generated method stub
		
	}
	
}
