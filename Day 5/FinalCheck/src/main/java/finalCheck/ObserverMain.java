package finalCheck;

import org.apache.log4j.Logger;

import finalCheck.observer.concreteclasses.Admin;
import finalCheck.observer.concreteclasses.NotificationService;
import finalCheck.observer.interfaces.INotificationObserver;
import finalCheck.observer.interfaces.INotificationService;

public class ObserverMain {
	private static Logger LOGGER = Logger.getLogger(ObserverMain.class);
	
	public static void main(String[] args) {
		LOGGER.info("Start of main()");
		INotificationService service = new NotificationService();
		INotificationObserver admin1 = new Admin(service,"Mr. X", 105);
		INotificationObserver admin2 = new Admin(service,"Mr. Y", 99);
		INotificationObserver admin3 = new Admin(service,"Mr. Z", 109);
		service.AddSubscriber(admin1);
		service.AddSubscriber(admin2);
		service.AddSubscriber(admin3);
		service.NotifySubscriber();
		service.RemoveSubscriber(admin2);
		service.NotifySubscriber();
		LOGGER.info("End of main()");
	}
}
