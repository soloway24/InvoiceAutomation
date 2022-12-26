package com.example.invoiceautomation.serivce;

import com.example.invoiceautomation.model.Payment;

public interface PaymentService {

    Payment create(Long invoiceOperationId);

    Payment completePayment(Payment payment);

    Payment createAndComplete(Long invoiceOperationId);

    /* rest of CRUD operations
     *
     *
     *
     */
}
