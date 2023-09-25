package br.com.easymoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EasyMoneyPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyMoneyPagamentoApplication.class, args);
	}

}
