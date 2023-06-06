package com.wiley.sbconcept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiley.sbconcept.model.PassengerInfo;
import com.wiley.sbconcept.model.PaymentInfo;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, String> {

}
