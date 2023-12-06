package id.itAcademy.ObserverAgency;

public class Agency implements Observer{
	
	private String name;
	private Observable agent;
	

	public Agency(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
		String msg = (String) agent.getUpdate(this);
		if(msg == null){
			System.out.println(name + ": No hi ha missatges nows");
		}else
		System.out.println(name + ": Nou missatege: " + msg);
		
	}

	@Override
	public void setObservable(Observable Observable) {

		this.agent = Observable;
	}

}
