package practiceCheck.observer.concreteclasses;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import practiceCheck.observer.interfaces.INotificationObserver;
import practiceCheck.observer.interfaces.INotificationService;

public class NotificationService implements INotificationService {
	private static Logger LOGGER = Logger.getLogger(NotificationService.class);

	List<INotificationObserver> observerList = new ArrayList<>();
	
	@Override
	public void AddSubscriber(INotificationObserver obj) {
		// TODO Auto-generated method stub
		LOGGER.info("Start of AddSubscriber()");
		observerList.add(obj);
		LOGGER.info("End of AddSubscriber()");
	}

	@Override
	public void RemoveSubscriber(INotificationObserver obj) {
		// TODO Auto-generated method stub
		LOGGER.info("Start of RemoveSubscriber()");
		observerList.remove(obj);
		LOGGER.info("End of RemoveSubscriber()");
	}

	@Override
	public void NotifySubscriber(String message) {
		// TODO Auto-generated method stub
		LOGGER.info("Start of NotifySubscriber()");
		for (INotificationObserver observer : observerList) {
			observer.onServerDown(message);
		}
		LOGGER.info("End of NotifySubscriber()");
	}

	

}
