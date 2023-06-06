package com.wiley.sbconcept.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.sbconcept.model.PassengerInfo;
import com.wiley.sbconcept.model.PaymentInfo;
import com.wiley.sbconcept.repository.PassengerInfoRepository;
import com.wiley.sbconcept.repository.PaymentInfoRepository;
import com.wiley.sbconcept.request.model.FlightBookingRequest;
import com.wiley.sbconcept.response.model.FlightBookingAck;
import com.wiley.sbconcept.util.PaymentUtils;

import jakarta.transaction.Transactional;

@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepository passengerRepo;
	
	@Autowired
	private PaymentInfoRepository paymentRepo;
	
	@Transactional
	public FlightBookingAck bookFlightTicket(FlightBookingRequest request) {
		
		PassengerInfo passengerinfo= request.getPassengerInfo();
		passengerinfo=passengerRepo.save(passengerinfo);
		
		PaymentInfo paymentinfo=request.getPaymentInfo();
		
		PaymentUtils.validateCrteditLimit(paymentinfo.getAccountno(), paymentinfo.getAmount());
		
		paymentinfo.setPassengerId(paymentinfo.getPaymentId());
		paymentinfo.setAmount(paymentinfo.getAmount());
		paymentRepo.save(paymentinfo);
		
		return new FlightBookingAck("success", paymentinfo.getAmount(),UUID.randomUUID().toString().split("-")[0],passengerinfo);
		
	}
}
