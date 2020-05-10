package practiceCheck;


import org.apache.log4j.Logger;

import practiceCheck.abstractfactory.classes.CarFactory;
import practiceCheck.abstractfactory.enums.CarType;
import practiceCheck.abstractfactory.enums.Location;

public class CarClient {
	private static Logger LOGGER = Logger.getLogger(CarClient.class);
	public static void main(String[] args) {
		LOGGER.info("Start of main()");
		LOGGER.debug(CarFactory.buildCar(CarType.MICRO, Location.USA).toString());
		LOGGER.debug(CarFactory.buildCar(CarType.MINI, Location.INDIA).toString());
		LOGGER.debug(CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT).toString());
		LOGGER.info("End of main()");
	}
}
