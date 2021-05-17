package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.PaymentService;
import com.example.demo.model.CardPayment;
import com.example.demo.model.MobilePayment;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@GetMapping(value = "/all-CardPayments")
	public ResponseEntity<Object> getAllPayments() {
		
		try {
			List<CardPayment> payements = paymentService.getAllPayements();
			if (!payements.isEmpty()) {
				return new ResponseEntity<>(payements, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
		
	}
	
	@GetMapping(value = "/all-MobilePayments")
	public ResponseEntity<Object> getMobilePayment(){
		
		try {
			List<MobilePayment> allMobilePayment = paymentService.getAllMobilePayment();
			
			if(!allMobilePayment.isEmpty()) {
				return new ResponseEntity<>(allMobilePayment,HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}	
		
	}
	
	@PostMapping(value = "/add-CardPayment")
	public ResponseEntity<CardPayment> addPayment(@RequestBody CardPayment cardPayment) {
		
		try {
			
		CardPayment paymentAdd = paymentService.addPayement(cardPayment);
		return new ResponseEntity<>(paymentAdd,HttpStatus.CREATED);
		
		} catch (Exception e) {

		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	
	
	@PostMapping(value = "/add-MoblePayment")
	public ResponseEntity<MobilePayment> addMobilePay(@RequestBody MobilePayment mobilePayment){
		try {
			
			MobilePayment mobilepayAdd = paymentService.addMobilePayment(mobilePayment);
			return new ResponseEntity<>(mobilepayAdd,HttpStatus.CREATED);
			
		}catch(Exception e) {
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	
	
	
	
	@GetMapping(value="/showPaymentMessage")
	public void showPaymentMessage(){
		System.out.println("show message");;
		
	}
	
}
