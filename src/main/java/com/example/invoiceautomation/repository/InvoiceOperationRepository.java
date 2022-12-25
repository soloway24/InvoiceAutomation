package com.example.invoiceautomation.repository;

import com.example.invoiceautomation.model.InvoiceOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceOperationRepository extends JpaRepository<InvoiceOperation, Long> {
}
