package practiceCheck.abstractfactory.classes;

import org.apache.log4j.Logger;

import practiceCheck.abstractfactory.abstractclasses.Car;
import practiceCheck.abstractfactory.enums.CarType;
import practiceCheck.abstractfactory.enums.Location;

public class MicroCar extends Car{

	private static Logger LOGGER = Logger.getLogger(MicroCar.class);
	
	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("Start of construct()");
		LOGGER.debug("Connecting to Micro Car");
		LOGGER.info("End of construct()");
	}
	

}
