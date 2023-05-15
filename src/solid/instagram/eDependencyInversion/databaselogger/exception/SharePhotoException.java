package solid.instagram.eDependencyInversion.databaselogger.exception;

public class SharePhotoException extends RuntimeException{
	
		private static final long serialVersionUID = 1L;
		String message;
		
		public SharePhotoException(String message) {
			super(message);
			this.message=message;
		
		}
	}


