package com.cognizant.classes;

import com.cognizant.interfaces.Phone;

public class Redmi7 implements Phone {

	@Override
	public String getPhonePart1() {
		return "display";
	}

	@Override
	public double getPart1Cost() {
		return 600;
	}

}
