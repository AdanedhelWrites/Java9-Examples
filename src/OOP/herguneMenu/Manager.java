package OOP.herguneMenu;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Manager {
	 // SU OLAYI UNUTMA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  SU OLAYI UNUTMA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 // SU OLAYI UNUTMA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  SU OLAYI UNUTMA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	List<EIcecek> icecekler = new ArrayList<>(Arrays.asList(EIcecek.values())); // SU OLAYI UNUTMA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 // SU OLAYI UNUTMA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  SU OLAYI UNUTMA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 // SU OLAYI UNUTMA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  SU OLAYI UNUTMA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	public Enum menuBelirle(Enum [] dizi) {
		int index = randomIndex(dizi.length);
		return dizi[index];
		
	}
	public int randomIndex(int value) {
		Random rand = new Random();
		return rand.nextInt(value);
		
	}
	
	public Menu menuOlustur() {
		ECorba corba=(ECorba) menuBelirle(ECorba.values());
		EYemek yemek= (EYemek) menuBelirle(EYemek.values());
		ETatli tatli = (ETatli) menuBelirle(ETatli.values());
		EIcecek icecek= icecekBelirle2();
		Menu menu=new Menu(corba, yemek, tatli, icecek);
		
		return menu;		
	}
	public EIcecek icecekBelirle(EIcecek [] dizi) {
		int index = randomIndex(dizi.length);
		while (dizi[index].isAtadiMi()) {
			index=randomIndex(dizi.length);
		}
		dizi[index].setAtadiMi(true);
		return dizi[index];
		
	}
	public EIcecek icecekBelirle2() {
		if (icecekler.isEmpty()) {
			icecekler = new ArrayList<>(Arrays.asList(EIcecek.values()));
		}
		int index = randomIndex(icecekler.size());
		EIcecek icecek=icecekler.get(index);
		icecekler.remove(icecek);
		//icecekler.remove(index); 2'side olur icecektende alabiliriz indextende
		return icecek;
	}
	public void haftalikMenu() {
		List<EGunler> gunler = new ArrayList<>(Arrays.asList(EGunler.values()));
		
		for (EGunler gun : gunler) {
			System.out.println((gun.ordinal()+1)+"-"+gun);
			System.out.println(menuOlustur());
		}
	}
}
