package OOP.enums;

public enum EAylar {
	OCAK(30,"Ocak"),
	SUBAT(28,"Subat"),
	MART(30, "Mart"),
	NISAN(31, "Nisan"),
	MAYIS(30, "Mayis"),
	HAZIRAN(30, "Haziran"),
	TEMMUZ(31, "Temmuz"),
	AGUSTOS(30, "Agustor"),
	EYLUL(30, "Eylul"),
	EKIM(31, "Ekim"),
	KASIM(30, "Kasim"),
	ARALIK(31, "Aralik");
	
	String isim;
	int i;
	EAylar(int i, String isim) {
		this.i = i;
		this.isim=isim;
		// TODO Auto-generated constructor stub
	}
	
	
	
}
