package practiceCheck.observer.concreteclasses;

import org.apache.log4j.Logger;

import practiceCheck.observer.interfaces.INotificationObserver;

public class JohnObserver implements INotificationObserver {
	private String name = "John";
	
	private static Logger LOGGER = Logger.getLogger(JohnObserver.class);
	
	@Override
	public void onServerDown(String message) {
		// TODO Auto-generated method stub
		LOGGER.info("Start of onServerDown()");
		LOGGER.debug(name + " : " + message);
		LOGGER.info("End of onServerDown()");
	}
	
}
