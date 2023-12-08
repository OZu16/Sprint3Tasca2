package id.itAcademy.DependencyInjection;

public class IenConverter implements CoinConverter{

	@Override
	public String conversion(float price) {
		
		return  "// conversió iens " + price*156.02f + "JPY";
	}

}
