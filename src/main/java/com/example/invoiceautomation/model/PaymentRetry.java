package com.example.invoiceautomation.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PaymentRetry {

    @Id
    private Long id;
    // one to one
    private Payment payment;
    private int retries;

}
