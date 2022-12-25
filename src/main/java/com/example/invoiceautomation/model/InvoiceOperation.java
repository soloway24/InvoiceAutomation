package com.example.invoiceautomation.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class InvoiceOperation {

    @Id
    private Long id;
    // each InvoiceOperation only to one Payer
    private Payer payer;
    // each InvoiceOperation to one Tariff
    private Tariff tariff;
    private Period period;
    private PaymentMode paymentMode;

    /*
     a token which is sent to a payment service

     The chosen payment service then will retrieve payer's card info and complete a transaction
     according to the received token
     */
    private String billingToken;

}
