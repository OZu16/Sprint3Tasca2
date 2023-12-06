package id.itAcademy.ObserverAgency;


public class App 
{
    public static void main( String[] args ) {
    	
    	Agent agent1 = new Agent();
    	
		Observer agency1 = new Agency("agency1");
		Observer agency2 = new Agency("agency2");
		Observer agency3 = new Agency("agency3");
		
		agent1.register(agency1);
		agent1.register(agency2);
		agent1.register(agency3);
		
		agency1.setObservable(agent1);
		agency2.setObservable(agent1);
		agency3.setObservable(agent1);
		
		agency1.update();
		
		agent1.postMessage("Cambios en borsa!");
		
		
		
    }
}
