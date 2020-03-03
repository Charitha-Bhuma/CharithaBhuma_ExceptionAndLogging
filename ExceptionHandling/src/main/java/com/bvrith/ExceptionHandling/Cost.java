package com.bvrith.ExceptionHandling;


import java.util.Scanner;
import java.util.logging.Logger;
	
public class Cost {

	public static void Evaluate() {
		Logger LOGGER = Logger.getLogger( Cost.class.getName());
		Scanner sc= new Scanner(System.in);
		LOGGER.info("Enter the cost of construction");
		LOGGER.info("Materials Available");
		LOGGER.info("Enter your choice : ");
		LOGGER.info("1. construction with standard materials\n2. construction with above standard materials\n"
				+ "3. construction with high standard materials\n4. construction with high standard materials and fully automated");
		try {
			int choice=sc.nextInt();
			LOGGER.info("Enter area to be covered covered: ");
			double area = sc.nextDouble();
			switch(choice){
			case 1: LOGGER.info("cost ="+area*1200 +" INR");
			   		break;
			case 2: LOGGER.info("cost ="+area*1500 +" INR");
					break;
			case 3: LOGGER.info("cost ="+area*1800 +" INR");
			   		break;
			case 4: LOGGER.info("cost ="+area*2500 +" INR");
			   		break;
			default: LOGGER.info("Invalid input ");
			}
		}
		catch (Exception e) {
			LOGGER.info("Enter a valid input");
		}
	}
}