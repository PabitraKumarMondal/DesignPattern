package com.cognizant.main;

import java.util.Scanner;

import com.cognizant.classes.PhoneOrder;
import com.cognizant.classes.ProcessPhoneRepair;
import com.cognizant.classes.Redmi7;
import com.cognizant.classes.Repair;
import com.cognizant.classes.SamsungNote;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String option = sc.next();
		String productDetail;
		//sc.nextLine();
		switch (option) {
			case "order":
						PhoneOrder phone = new PhoneOrder();
						System.out.println("Please provide the phone model name");
						productDetail = sc.next();
						phone.ProcessOrder(productDetail);
						break;
			case "repair":
						System.out.println("Is it the phone or accessory that you want to be repaired?");
						String repairType = sc.next();
						if (repairType.equals("phone")) {
							System.out.println("Please provide the phone model name");
							productDetail = sc.next();
							Repair repair = new Repair();
							repair.ProcessPhoneRepair(productDetail);
							ProcessPhoneRepair phoneRepair = new ProcessPhoneRepair();
							if (productDetail.equalsIgnoreCase("SamsungNote")) {
								SamsungNote note = new SamsungNote();
								phoneRepair.RepairSteps(note);
							}else if(productDetail.equalsIgnoreCase("Redmi7") ) {
								Redmi7 redmi = new Redmi7();
								phoneRepair.RepairSteps(redmi);
							}
							
						}
						else {
							System.out.println("Please provide the accessory detail, like headphone, tempered glass");
							productDetail = sc.next();
							Repair repair = new Repair();
							repair.ProcessAccessoryRepair(productDetail);
						}
						break;
			default:
						break;
		}
	}
}
