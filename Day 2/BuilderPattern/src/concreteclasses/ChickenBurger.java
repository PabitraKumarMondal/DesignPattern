package concreteclasses;

import abstractclasses.Burger;

public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 55.0f;
	}
}
