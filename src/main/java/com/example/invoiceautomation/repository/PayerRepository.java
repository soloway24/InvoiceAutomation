package com.example.invoiceautomation.repository;

import com.example.invoiceautomation.model.Payer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayerRepository extends JpaRepository<Payer, Long> {
}
