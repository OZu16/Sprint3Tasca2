package id.itAcademy.DependencyInjection;

public abstract class Product {
	
	private String name;
	private String type;
	private float priceInEuros;
	private CoinConverter coinConverter;
	
	
	public Product(String name, String type, float priceInEuros, CoinConverter coinConverter) {
		
		this.name = name;
		this.type = type;
		this.priceInEuros = priceInEuros;
		this.coinConverter = coinConverter;
	}
	


	public CoinConverter getCoinConverter() {
		return coinConverter;
	}


	public float getPriceInEuros() {
		return priceInEuros;
	}

	public String getName() {
		return name;
	}


	public abstract void convertedPrice();
}
