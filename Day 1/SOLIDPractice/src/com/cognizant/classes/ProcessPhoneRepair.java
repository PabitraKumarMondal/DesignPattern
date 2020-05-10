package com.cognizant.classes;

import com.cognizant.interfaces.Phone;

public class ProcessPhoneRepair {
	public void RepairSteps(Phone phone) {
		System.out.println(phone.getPhonePart1()+ " repaired.");
		System.out.println("Repair cost " + phone.getPart1Cost());
	}
}
