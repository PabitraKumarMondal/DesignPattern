package practiceCheck.abstractfactory.classes;

import practiceCheck.abstractfactory.abstractclasses.Car;
import practiceCheck.abstractfactory.enums.CarType;
import practiceCheck.abstractfactory.enums.Location;

public class USACarFactory {
	public static Car buildCar(CarType model) {
		Car car = null;
		switch(model)
		{
			case MICRO :
					car = new MicroCar(Location.USA);
					break;
			case MINI :
					car = new MiniCar(Location.USA);
					break;
			case LUXURY :
					car = new LuxuryCar(Location.USA);
					break;
			default :
					break;
		}
		return car;
	}
}
