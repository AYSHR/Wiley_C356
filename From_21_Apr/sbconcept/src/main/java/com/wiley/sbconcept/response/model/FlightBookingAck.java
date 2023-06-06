package com.wiley.sbconcept.response.model;

import com.wiley.sbconcept.model.PassengerInfo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class FlightBookingAck {

	private String status;
	private double totalfare;
	private String pnrno;
	private PassengerInfo passengerinfo;
	public FlightBookingAck(String status, double totalfare, String pnrno, PassengerInfo passengerinfo) {
		super();
		this.status = status;
		this.totalfare = totalfare;
		this.pnrno = pnrno;
		this.passengerinfo = passengerinfo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalfare() {
		return totalfare;
	}
	public void setTotalfare(double totalfare) {
		this.totalfare = totalfare;
	}
	public String getPnrno() {
		return pnrno;
	}
	public void setPnrno(String pnrno) {
		this.pnrno = pnrno;
	}
	public PassengerInfo getPassengerinfo() {
		return passengerinfo;
	}
	public void setPassengerinfo(PassengerInfo passengerinfo) {
		this.passengerinfo = passengerinfo;
	}
	
	
}
