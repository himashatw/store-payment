package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.CardPayment;
import com.example.demo.model.MobilePayment;

@Service
public interface PaymentService {

	public CardPayment addPayement(CardPayment cardPayment);
	public List<CardPayment> getAllPayements();
	
	public String PaymentIncompleted();
	public String PaymentIsNotfound();
	
	
	public List<MobilePayment> getAllMobilePayment();
	public MobilePayment addMobilePayment(MobilePayment mobilePayment);
	
	
}
