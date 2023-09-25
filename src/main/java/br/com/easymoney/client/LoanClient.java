package br.com.easymoney.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "loan-service", url = "http://localhost:8090/emprestimos")
public interface LoanClient {

	@PostMapping("{id}/pagamento/confirmar")
	public ResponseEntity<Void> paymentConfirm(@PathVariable(value = "id", required = true ) String id);
}
