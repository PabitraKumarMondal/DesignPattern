package practiceCheck.abstractfactory.classes;

import org.apache.log4j.Logger;

import practiceCheck.abstractfactory.abstractclasses.Car;
import practiceCheck.abstractfactory.enums.CarType;
import practiceCheck.abstractfactory.enums.Location;

public class LuxuryCar extends Car{
	private static Logger LOGGER = Logger.getLogger(LuxuryCar.class);

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("Start of construct()");
		LOGGER.debug("Connecting to luxury car");
		LOGGER.info("End of construct()");
	}
	
}
