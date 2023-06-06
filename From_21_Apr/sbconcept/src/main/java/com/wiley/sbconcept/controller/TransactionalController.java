package com.wiley.sbconcept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.sbconcept.request.model.FlightBookingRequest;
import com.wiley.sbconcept.response.model.FlightBookingAck;
import com.wiley.sbconcept.service.FlightBookingService;

@RequestMapping(value = "/api/v1")
@RestController
public class TransactionalController {
  
	@Autowired
	private FlightBookingService service;
	
	@PostMapping("/bookFlightTicket")
	public FlightBookingAck bookFlightTicket(
			@RequestBody FlightBookingRequest request) {
		return service.bookFlightTicket(request);
	}
}
