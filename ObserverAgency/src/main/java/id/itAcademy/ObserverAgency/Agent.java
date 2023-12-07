package id.itAcademy.ObserverAgency;

import java.util.ArrayList;
import java.util.List;

public class Agent implements Observable{
	
	private List<Observer> observers;
	private String message;
	private boolean changed;
	
	

	public Agent() {
		this.observers=new ArrayList<>();
	}
	
	

	@Override
	public void register(Observer obj) {

		if(!observers.contains(obj)) observers.add(obj);
	}

	@Override
	public void unregister(Observer obj) {

		observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		
		if (!changed) {
			this.changed = true;
		}
			observers.forEach(obj -> obj.update());

	
	}

	@Override
	public Object getUpdate(Observer obj) {

		return this.message;
	}
	
	public void postMessage(String msg){
		System.out.println("Mensaje para agencias :"+ msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

}
