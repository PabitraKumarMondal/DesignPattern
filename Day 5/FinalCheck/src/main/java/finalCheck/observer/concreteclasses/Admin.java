package finalCheck.observer.concreteclasses;

import org.apache.log4j.Logger;

import finalCheck.observer.interfaces.INotificationObserver;
import finalCheck.observer.interfaces.INotificationService;

public class Admin extends INotificationObserver{
	private static Logger LOGGER = Logger.getLogger(Admin.class);
	
	public Admin(INotificationService service, String name, int noOfTicket) {
		super(service, name, noOfTicket);
	}

	@Override
	public void on100TicketBook() {
		LOGGER.info("Start of on100TicketBook()");
		LOGGER.debug("100+ Ticket booked by " + name);
		LOGGER.info("End of on100TicketBook()");
	}

}
