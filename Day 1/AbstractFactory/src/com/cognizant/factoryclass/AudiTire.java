package com.cognizant.factoryclass;

import com.cognizant.abstractfactoryclass.Tire;

public class AudiTire extends Tire{

	@Override
	public String getTireType() {
		return "Audi";
	}
	
}
