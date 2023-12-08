package id.itAcademy.DependencyInjection;

public class Apple extends Product{

	public Apple(String name, String type, float priceInEuros, CoinConverter coinConverter) {
		super(name, type, priceInEuros, coinConverter);
	}

	@Override
	public void convertedPrice() {
		
		System.out.println(getName() + " " + getPriceInEuros()+ "€" + getCoinConverter().conversion(getPriceInEuros()));
	}

}
