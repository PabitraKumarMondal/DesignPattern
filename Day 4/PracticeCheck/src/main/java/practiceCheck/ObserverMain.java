package practiceCheck;

import org.apache.log4j.Logger;

import practiceCheck.observer.concreteclasses.JohnObserver;
import practiceCheck.observer.concreteclasses.NotificationService;
import practiceCheck.observer.concreteclasses.SteveObserver;
import practiceCheck.observer.interfaces.INotificationObserver;
import practiceCheck.observer.interfaces.INotificationService;

public class ObserverMain {
	private static Logger LOGGER = Logger.getLogger(ObserverMain.class);
	public static void main(String[] args) {
		LOGGER.info("Start of main()");
		INotificationService service = new NotificationService();
		INotificationObserver steve = new SteveObserver();
		INotificationObserver john = new JohnObserver();
		service.AddSubscriber(steve);
		service.AddSubscriber(john);
		service.NotifySubscriber("First Message");
		service.RemoveSubscriber(john);
		service.NotifySubscriber("Second Message");
		LOGGER.info("End of main()");
	}
}
