package com.example.invoiceautomation.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

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
    private Double sum;

    public Payment(InvoiceOperation invoiceOperation, PaymentStatus status, Date date) {
        this.invoiceOperation = invoiceOperation;
        this.status = status;
        this.date = date;
    }

    /*
    * when Payment is created the sum is calculated from the InvoiceOperation.
    * */
}
