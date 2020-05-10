package finalCheck.observer.concreteclasses;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import finalCheck.observer.interfaces.INotificationObserver;
import finalCheck.observer.interfaces.INotificationService;

public class NotificationService implements INotificationService {
	List<INotificationObserver> observers = new ArrayList<>();
	
	private static Logger LOGGER = Logger.getLogger(NotificationService.class);
	
	@Override
	public void AddSubscriber(INotificationObserver obj) {
		LOGGER.info("Start of AddSubscriber()");
		observers.add(obj);
		LOGGER.info("End of AddSubscriber()");
	}

	@Override
	public void RemoveSubscriber(INotificationObserver obj) {
		LOGGER.info("Start of RemoveSubscriber()");
		observers.remove(obj);
		LOGGER.info("End of RemoveSubscriber()");
	}

	@Override
	public void NotifySubscriber() {
		LOGGER.info("Start of NotifySubscriber()");
		for (INotificationObserver observer : observers) {
			if(observer.getNoOfTicket()>100)
				observer.on100TicketBook();
		}
		LOGGER.info("End of NotifySubscriber()");
	}
	

}
