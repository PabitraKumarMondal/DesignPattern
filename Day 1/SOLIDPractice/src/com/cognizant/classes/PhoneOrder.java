package com.cognizant.classes;

import com.cognizant.interfaces.IProcessOrder;

public class PhoneOrder implements IProcessOrder {

	@Override
	public void ProcessOrder(String modelName) {
		System.out.println(modelName + " order accepted.");
	}

}
