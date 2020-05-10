package practiceCheck.abstractfactory.abstractclasses;

import practiceCheck.abstractfactory.enums.CarType;
import practiceCheck.abstractfactory.enums.Location;

public abstract class Car {
	private CarType model = null;
	private Location location = null;
	
	public Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}
	
	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	protected abstract void construct();

	@Override
	public String toString() {
		return "CarModel - " + model + " located in - " + location;
	}
	
}
