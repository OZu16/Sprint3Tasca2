package id.itAcademy.Callback;

public class BankAccount extends Payment{

	private final String IBAN;
	private final String NAME;
	private double funds;
	
	
	public BankAccount(String IBAN, String NAME, double funds) {

		this.IBAN = IBAN;
		this.NAME = NAME;
		this.funds = funds;
	}

	@Override
	public void execute() {
		
		System.out.println("Executant transferència bancària...\n"
				+ "5%...\n"
				+ "23%...\n"
				+ "34%...\n"
				+ "55%...\n"
				+ "78%...\n"
				+ "80%...\n"
				+ "99%...\n");
		
	}

}
