package com.cognizant.main;

import com.cognizant.abstractfactoryclass.Factory;
import com.cognizant.factoryclass.AudiFactory;
import com.cognizant.factoryclass.MercedesFactory;

public class FactoryGetter {
	public static Factory getFactory(String factoryType) {
		if(factoryType.equalsIgnoreCase("Audi")) {
			return new AudiFactory();
		}
		else if(factoryType.equalsIgnoreCase("Mercedes")) {
			return new MercedesFactory();
		}
		else
			return null;
	}
}
