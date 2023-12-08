package id.itAcademy.DependencyInjection;


public class App {
	
    public static void main( String[] args ) {
    	
    	Product apple1 = new Apple("golden apple", "food", 3.55f, new DollarConverter());
    	Product apple2 = new Apple("golden apple", "food", 3.55f, new IenConverter());
    	
    	apple1.convertedPrice();
    	apple2.convertedPrice();
    }
    
}
