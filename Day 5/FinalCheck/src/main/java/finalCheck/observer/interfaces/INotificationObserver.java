package finalCheck.observer.interfaces;

public abstract class INotificationObserver {
	protected INotificationService service;
	protected String name;
	protected int noOfTicket;
	
	
	public INotificationObserver(INotificationService service, String name, int noOfTicket) {
		this.service = service;
		this.name = name;
		this.noOfTicket = noOfTicket;
	}

	

	public int getNoOfTicket() {
		return noOfTicket;
	}


	public abstract void on100TicketBook();
}
