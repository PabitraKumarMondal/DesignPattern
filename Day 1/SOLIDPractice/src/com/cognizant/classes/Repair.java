package com.cognizant.classes;

import com.cognizant.interfaces.IProcessAccessoryRepair;
import com.cognizant.interfaces.IProcessPhoneRepair;

public class Repair implements IProcessPhoneRepair, IProcessAccessoryRepair {

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType + " repair accepted.");

	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println(modelName + " repair accepted.");
	}

}
