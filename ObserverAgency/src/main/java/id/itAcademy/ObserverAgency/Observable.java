package id.itAcademy.ObserverAgency;

public interface Observable {
	

	public void register(Observer obj);
	public void unregister(Observer obj);
	
	public void notifyObservers();
	
	public Object getUpdate(Observer obj);

}
