package com.cognizant.factoryclass;

import com.cognizant.abstractfactoryclass.Factory;
import com.cognizant.abstractfactoryclass.Headlight;
import com.cognizant.abstractfactoryclass.Tire;

public class MercedesFactory extends Factory{

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
