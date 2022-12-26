package com.example.invoiceautomation.serivce;

import com.example.invoiceautomation.model.Payment;

public interface PaymentRetrier {

    void invokeRetry(Payment payment, PaymentPlatformService paymentPlatformService);
    Payment retryPayment(Payment payment, PaymentPlatformService paymentPlatformService);

}
