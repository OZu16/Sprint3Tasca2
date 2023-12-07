package id.itAcademy.Callback;

public class Paypal extends Payment {

	private String userName;
	private String password;
	private double funds;
	
	
	public Paypal(String userName, String password, double funds) {
	
		this.userName = userName;
		this.password = password;
		this.funds = funds;
	}



	@Override
	public void execute() {
		
		System.out.println("Executant pagament amb PayPal...\n"
				+ "5%...\n"
				+ "23%...\n"
				+ "34%...\n"
				+ "55%...\n"
				+ "78%...\n"
				+ "80%...\n"
				+ "99%...\n");
		
	}
	
}
