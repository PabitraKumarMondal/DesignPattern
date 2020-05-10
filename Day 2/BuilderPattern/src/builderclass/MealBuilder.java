package builderclass;

import concreteclasses.ChickenBurger;
import concreteclasses.Coke;
import concreteclasses.Meal;
import concreteclasses.Pepsi;
import concreteclasses.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	public Meal prepareNonVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
