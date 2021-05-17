package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CardPayementRepository;
import com.example.demo.Repository.MobilePaymentRepository;
import com.example.demo.Services.PaymentService;
import com.example.demo.model.CardPayment;
import com.example.demo.model.MobilePayment;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	CardPayementRepository paymentRepository;
	
	@Autowired
	MobilePaymentRepository mpayRepo;

	@Override
	public CardPayment addPayement(CardPayment cardPayment) {
		// TODO Auto-generated method stub
		
		 paymentRepository.save(cardPayment);
		 return cardPayment;
	}
	
	@Override
	public List<CardPayment> getAllPayements() {
		// TODO Auto-generated method stub
		System.out.println("Hiiiiiiiiiiiiiiiii");
		return paymentRepository.findAll();
	}

	@Override
	public List<MobilePayment> getAllMobilePayment() {
			
		// TODO Auto-generated method stub
		System.out.println("Get All the Payments");
		return mpayRepo.findAll();
	}

	@Override
	public MobilePayment addMobilePayment(MobilePayment mobilePayment) {
		// TODO Auto-generated method stub
		
		mpayRepo.save(mobilePayment);
		return mobilePayment;
	}
	
	
	@Override
	public String  PaymentIncompleted() {
		// TODO Auto-generated method stub
		return "CardPayment is ";
	}
	
	public String PaymentIsNotfound() {
		return "Payement is Notfound";
	}



	
	
	

	
	
}
