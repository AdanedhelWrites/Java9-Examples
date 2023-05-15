package solid.instagram.eDependencyInversion.databaselogger;

import solid.instagram.eDependencyInversion.MySql;
import solid.instagram.eDependencyInversion.Whatsapp;
import solid.instagram.eDependencyInversion.databaselogger.exception.SharePhotoException;
import solid.instagram.eDependencyInversion.databaselogger.exception.VideoException;

public class Test {
	public static void main(String[] args) {
		Whatsapp wp = new Whatsapp();
		
		try {
			wp.videoConferencing();
		} catch (VideoException e) {
			// TODO: handle exception
			new DatabaseLogger(new Mongo()).log(e.getMessage());
			
		}
		try {
			wp.sharePhoto();
		} catch (SharePhotoException e) {
			// TODO: handle exception
			new DatabaseLogger(new MySql()).log(e.getMessage());
		}
			
	}
}
