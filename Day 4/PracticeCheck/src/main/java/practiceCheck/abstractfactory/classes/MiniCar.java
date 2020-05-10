package practiceCheck.abstractfactory.classes;

import org.apache.log4j.Logger;

import practiceCheck.abstractfactory.abstractclasses.Car;
import practiceCheck.abstractfactory.enums.CarType;
import practiceCheck.abstractfactory.enums.Location;

public class MiniCar extends Car{

	private static Logger LOGGER = Logger.getLogger(MiniCar.class);
	
	public MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("Start of construct()");
		LOGGER.debug("Connecting to Mini Car");
		LOGGER.info("End of construct()");
	}

}
