package designPatterns.factory.pizza;

public class PizzaFactory {
	public static Pizza pizzaOlustur(EPizzaTur tur,EHamurTipi hamurTipi,EPizzaBoyutu pizzaBoyutu) {		
		switch (tur) {
		case PIZZA_SOSLU:
			return new KlasikPizza(hamurTipi, pizzaBoyutu, tur);
		case PIZZA_SOSSUZ:
			return new VeganPizza(hamurTipi, pizzaBoyutu, tur);
		default:
			break;
		}
		return null;
	}
}
