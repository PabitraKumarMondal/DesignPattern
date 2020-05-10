package practiceCheck.abstractfactory.classes;

import practiceCheck.abstractfactory.abstractclasses.Car;
import practiceCheck.abstractfactory.enums.CarType;
import practiceCheck.abstractfactory.enums.Location;

public class CarFactory {
	public static Car buildCar(CarType model, Location location) {
		Car car = null;
		switch(location)
		{
			case USA : 
					car = USACarFactory.buildCar(model);
					break;
			case INDIA :
					car = IndiaCarFactory.buildCar(model);
					break;
			case DEFAULT :
					car = DefaultCarFactory.buildCar(model);
					break;
			default:
					break;
		}
		return car;
	}
}
