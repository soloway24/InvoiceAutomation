package com.example.invoiceautomation.repository;

import com.example.invoiceautomation.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
