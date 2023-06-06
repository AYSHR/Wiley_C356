package com.wiley.sbconcept.util;

import java.util.Map;
import java.util.HashMap;
import com.wiley.sbconcept.exception.InsufficientAmountException;

public class PaymentUtils {
	private static Map<String, Double> paymentMap= new HashMap<>();
	
	static {
		paymentMap.put("ac_1", 9000.0);
		paymentMap.put("ac_2", 12000.0);
		paymentMap.put("ac_3", 6000.0);
		paymentMap.put("ac_4", 7000.0);
		paymentMap.put("ac_5", 11000.0);
	}
	
	public static boolean validateCrteditLimit(String accNo, double paidAmount) {
		if(paidAmount> paymentMap.get("ac_1")){
			throw new InsufficientAmountException("insufficient balance ...");
		}else {
			return true;
		}
	}
}
