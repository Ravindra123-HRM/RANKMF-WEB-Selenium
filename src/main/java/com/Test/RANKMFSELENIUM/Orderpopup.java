package com.Test.RANKMFSELENIUM;

import RankmfBase.TestBase;
import utility.Constant;
import utility.util;

public class Orderpopup extends TestBase {
	
	public static String otp() throws Exception {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the OTP : ");
		 * String sotp =sc.next();
		 */
	//Thread.sleep(2000);
		String sotp = util.getdbdata("mutual_funds","SELECT otp FROM mf_otp WHERE client_id = '"+Constant.Username+"'  ORDER BY id DESC");
		System.out.println("OTP FOR ORDERS : "+sotp);
		
		return sotp;
	}
	
	public static String otp1() throws Exception {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the OTP : ");
		 * String sotp =sc.next();
		 */
	//Thread.sleep(2000);
		String sotp = util.getdbdata1("mutual_funds","SELECT otp FROM mf_otp WHERE client_id = '"+Constant.User+"'  ORDER BY id DESC");
		System.out.println("OTP FOR ORDERS : "+sotp);
		
		return sotp;
	}
	
	
	
	

}
