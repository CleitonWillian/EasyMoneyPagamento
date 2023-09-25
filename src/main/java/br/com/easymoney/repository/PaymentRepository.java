package br.com.easymoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.easymoney.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}
