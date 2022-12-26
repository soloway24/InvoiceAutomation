package com.example.invoiceautomation.serivce;

import com.example.invoiceautomation.model.Payment;

public interface PaymentPlatformService {

    Payment completeTransaction(Payment payment);
}
