package br.com.easymoney.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.easymoney.service.PaymentService;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/pagamentos")
@AllArgsConstructor
public class PaymentController {

	private final PaymentService service;
	
	@PostMapping("/emprestimo/{id}/confirmar")
	public ResponseEntity<Void> confirm(@PathVariable(value = "id", required = true)String loanId ){
		
		service.loanConfirm(loanId);
		
		return ResponseEntity.noContent().build();
		
	}
	
}
