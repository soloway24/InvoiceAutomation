package com.example.invoiceautomation.repository;

import com.example.invoiceautomation.model.Payment;
import com.example.invoiceautomation.model.PaymentRetry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRetryRepository extends JpaRepository<PaymentRetry, Long> {

    Optional<PaymentRetry> findByPayment(Payment payment);
}
