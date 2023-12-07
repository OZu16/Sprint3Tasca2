package id.itAcademy.Callback;


public abstract class Payment {
	
	
	final void executeWith(Callback callback) {
		execute();
		callback.call();
	}	

	 public abstract void execute();
}
