package id.itAcademy.Callback;

import java.util.Scanner;

public class ShoeStore {
	
	static Scanner sc = new Scanner(System.in);
	
	public void payment () {
		
		int menu;
		
		ShoeStore pabloski = new ShoeStore();

		Payment paypalPayment = new Paypal("Usuari1234", "Contraseña1234", 1000);
		Payment creditcardPayment = new CreditCard("1234-1234-1234-1234", "Paco", 123, 1000);
		Payment bankacountPayment = new BankAccount("ABCD-1234-1234-1234", "Paco", 1000);

		System.out.println("Amb què desitges pagar:\n"
				+ "1.- Paypal\n"
				+ "2.- Targeta de crèdit\n"
				+ "3.- Transferència bancària");
		
		switch(menu = sc.nextInt()) {
		case 1:
			paypalPayment.executeWith(()-> System.out.println("Pagament completat!"));
			break;
		case 2:
			creditcardPayment.executeWith(()-> System.out.println("Pagament completat!"));
			break;
		case 3:
			bankacountPayment.executeWith(()-> System.out.println("Pagament completat!"));
			break;
		default:
			System.err.println("Error selecionant tipus de pagament!");
		}
	}

}
