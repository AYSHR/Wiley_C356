package com.wiley.sbconcept.request.model;

import org.springframework.data.annotation.Id;

import com.wiley.sbconcept.model.PassengerInfo;
import com.wiley.sbconcept.model.PaymentInfo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FlightBookingRequest {
	
	
	private PassengerInfo passengerInfo;
	private PaymentInfo paymentInfo;

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

}
