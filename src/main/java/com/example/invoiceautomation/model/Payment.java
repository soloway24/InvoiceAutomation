package com.example.invoiceautomation.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Payment {

    @Id
    private Long id;
    // each Payment to one InvoiceOperation
    private InvoiceOperation invoiceOperation;
    private PaymentStatus status;
    // or Instant or any other date/datetime class as needed
    private Date date;
}
