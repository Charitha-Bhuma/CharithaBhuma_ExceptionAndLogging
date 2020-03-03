package com.bvrith.ExceptionHandling;

import java.util.Scanner;
import java.util.logging.Logger;
public class SAndCUsingLogger{
	public static void Calculate(){
		Logger LOGGER = Logger.getLogger( SAndCUsingLogger.class.getName());
		Scanner sc=new Scanner(System.in);
		try {
			LOGGER.info("Enter principle amount");
			double principal = sc.nextDouble();
			LOGGER.info("Enter time ");
			double time = sc.nextDouble();
			LOGGER.info("Enter rate of interest");
			double Rate=sc.nextDouble();
			LOGGER.info("Simple Interest :"+(principal*time*Rate)/100);
			LOGGER.info("Compound Interest :"+((principal*Math.pow(1+(Rate/100),time)-principal)));
			}
		catch (Exception e) {
			LOGGER.info("Enter a valid input ... ");
		}
	}
}