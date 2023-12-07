package id.itAcademy.Callback;

public class CreditCard extends Payment{

    private final String CARDNUMBER;
    private final String NAME;
    private final int CVV;
    private double funds;
    
	
	public CreditCard(String CARDNUMBER, String NAME, int CVV, double funds) {

		this.CARDNUMBER = CARDNUMBER;
		this.NAME = NAME;
		this.CVV = CVV;
		this.funds = funds;
	}
	

	@Override
	public void execute() {
		
		System.out.println("Executant pagament amb tarjeta...\n"
				+ "5%...\n"
				+ "23%...\n"
				+ "34%...\n"
				+ "55%...\n"
				+ "78%...\n"
				+ "80%...\n"
				+ "99%...\n");
	}

}
