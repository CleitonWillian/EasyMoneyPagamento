package br.com.easymoney.service;

import org.springframework.stereotype.Service;

import br.com.easymoney.client.LoanClient;
import br.com.easymoney.entity.Payment;
import br.com.easymoney.repository.PaymentRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PaymentService {

	private final PaymentRepository repository;
	
	private final LoanClient client;
	
	public void loanConfirm(String loanId) {
		
	 repository.save(Payment.builder()
		.loanId(loanId)
		.build());
	 
	 client.paymentConfirm(loanId);
		
	}
	

}
