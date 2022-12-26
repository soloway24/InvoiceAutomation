package com.example.invoiceautomation.serivce.implementation;

import com.example.invoiceautomation.model.Payment;
import com.example.invoiceautomation.model.PaymentRetry;
import com.example.invoiceautomation.repository.PaymentRetryRepository;
import com.example.invoiceautomation.serivce.PaymentPlatformService;
import com.example.invoiceautomation.serivce.PaymentRetrier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BasicPaymentRetrier implements PaymentRetrier {

    private static final int MAX_RETRIES = 2;
    private final PaymentRetryRepository paymentRetryRepository;

    @Override
    public void invokeRetry(Payment payment, PaymentPlatformService paymentPlatformService) {
        // use spring scheduling or other libs to set the time when the retry has to be done

        // for example, use Quartz : create job which will use retryPayment() method, and trigger which will run only once
        // when the next 24 hours pass

        // trigger should be "triggered" only once because after each try to complete a transaction the retry is reinvoked
    }

    @Override
    public Payment retryPayment(Payment payment, PaymentPlatformService paymentPlatformService) {
        Optional<PaymentRetry> paymentRetry = paymentRetryRepository.findByPayment(payment);
        if (paymentRetry.isPresent()) {
            PaymentRetry retry = paymentRetry.get();
            if (retry.getRetries() + 1 > MAX_RETRIES) {
                // payerBanService.ban(payment.getInvoiceOperation().getPayer())
                return payment;
            }
            retry.setRetries(retry.getRetries() + 1);
            paymentPlatformService.completeTransaction(payment);
            return payment;
        } else {
            PaymentRetry retry = new PaymentRetry(null, payment, 1);
            paymentRetryRepository.save(retry);
            paymentPlatformService.completeTransaction(payment);
            return payment;
        }
    }
}
