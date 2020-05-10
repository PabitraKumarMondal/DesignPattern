package com.cognizant.main;

import com.cognizant.abstractfactoryclass.Factory;
import com.cognizant.abstractfactoryclass.Headlight;
import com.cognizant.abstractfactoryclass.Tire;

public class Client {
	public static void main(String[] args) {
		
		Factory factory = FactoryGetter.getFactory("Mercedes");
		if(factory == null) {
			System.out.println("Factory name mismatched");
			return;
		}
		Headlight headlight = factory.makeHeadlight();
		Tire tire = factory.makeTire();
		System.out.println("Headlight Type: " + headlight.getHeadlightType());
		System.out.println("Tire Type: " + tire.getTireType());
		
		Factory factory2 = FactoryGetter.getFactory("Audi");
		if(factory2 == null) {
			System.out.println("Factory name mismatched");
			return;
		}
		Headlight headlight2 = factory2.makeHeadlight();
		Tire tire2 = factory2.makeTire();
		System.out.println("Headlight Type: " + headlight2.getHeadlightType());
		System.out.println("Tire Type: " + tire2.getTireType());
		
	}
}
