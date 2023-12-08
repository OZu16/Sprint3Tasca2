package id.itAcademy.DependencyInjection;

public class DollarConverter implements CoinConverter{

	@Override
	public String conversion(float price) {
		
		return  "// conversió dolars " + price*1.08f + "$";
	}

}
