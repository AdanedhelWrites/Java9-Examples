package arrays;

public class WhatIsArrays {

	public static void main(String[] args) {
		String[] dizi = new String[3];		//3 elemanli dizi ++ 3 population array
		dizi[0] ="Adanedhel";
		dizi[2]="Beren&Luthien";
		//dizi[4] = "Melkor"; // outofboundexception error(return RUNTIME error)
		
		String dizi2[] = new String[4];
		dizi2[3] = "SongOfUniverse";
		String[] dizi3= {"Melkor","Valar","Iluvatar","Elrond"};
		System.out.println(dizi3[0]+"\n"+dizi3[1]+"\n"+dizi3[2]);
		System.out.println("******************");
		for (int i = 0; i < dizi3.length; i++) {
			System.out.println(dizi3[i]);//for gosterimi.. USAGE WITH FOR		
		}
		System.out.println("*****************************");
		for (int i = dizi3.length-1; i >= 0; i--) {//for ters gosterimi.. USAGE REVERSE ARRAY WITH FOR
			System.out.println(dizi3[i]);
		}
		
		System.out.println("***********************");
		for (String j : dizi3) {
			System.out.println(j);//foreach gösterimi.. USAGE WITH FOREACH
			
		}
		int[]dizi4 = new int[6];
		System.out.println(dizi4[2]+"\t"+dizi4[2]);
	}

}
