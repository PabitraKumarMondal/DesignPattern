package practiceCheck.observer.concreteclasses;

import org.apache.log4j.Logger;

import practiceCheck.observer.interfaces.INotificationObserver;

public class SteveObserver implements INotificationObserver {
	String name = "Steve";
	
	private static Logger LOGGER = Logger.getLogger(SteveObserver.class);

	@Override
	public void onServerDown(String message) {
		LOGGER.info("Start of onServerDown()");
		LOGGER.debug(name + " : "+ message);
		LOGGER.info("End of onServerDown()");
	}

}
