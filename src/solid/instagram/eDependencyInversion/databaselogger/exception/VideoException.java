package solid.instagram.eDependencyInversion.databaselogger.exception;

public class VideoException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public VideoException(String message) {
		super(message);
		this.message=message;
	
	}
}
