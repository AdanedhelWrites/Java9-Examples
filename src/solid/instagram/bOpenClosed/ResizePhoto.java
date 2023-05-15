package solid.instagram.bOpenClosed;

public class ResizePhoto {
//	public static void resimBoyutlandir(Instagram instagram, String type) {
//		if (type == "jpg") {
//			instagram.setKucultmeKatSayisi(38);
//			System.out.println(instagram.getKucultmeKatSayisi());
//		}else if (type == "png") {
//			instagram.setKucultmeKatSayisi(30);
//			System.out.println(instagram.getKucultmeKatSayisi());
//		} else {
//			instagram.setKucultmeKatSayisi(8);
//			System.out.println(instagram.getKucultmeKatSayisi());
//		}
//	}
//	public static void resimBoyutlandir(Facebook facebook, String type) {
//		if (type == "jpg") {
//			facebook.setKucultmeKatSayisi(38);
//			System.out.println(facebook.getKucultmeKatSayisi());
//		}else if (type == "png") {
//			facebook.setKucultmeKatSayisi(30);
//			System.out.println(facebook.getKucultmeKatSayisi());
//		} else {
//			facebook.setKucultmeKatSayisi(8);
//			System.out.println(facebook.getKucultmeKatSayisi());
//		}
//	}
	public void resize(SocialMedia socialMedia,String type) {
		socialMedia.changeScaleRatio(type);
	}
}
