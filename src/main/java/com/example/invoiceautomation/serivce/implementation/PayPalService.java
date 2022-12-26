package com.example.invoiceautomation.serivce.implementation;

import com.example.invoiceautomation.model.Payment;
import com.example.invoiceautomation.model.PaymentBankingInfo;
import com.example.invoiceautomation.model.PaymentStatus;
import com.example.invoiceautomation.serivce.PaymentPlatformService;
import org.springframework.stereotype.Service;

@Service
public class PayPalService implements PaymentPlatformService {

    // @Async or any other option to make the method asynchronous
    @Override
    public Payment completeTransaction(Payment payment) {
        PaymentBankingInfo bankingInfo = payment
                .getInvoiceOperation()
                .getTariff()
                .getBankingInfo();
        /*
         * Using PayPal API or whatever to complete transaction.
         * As I have mentioned in the README file, it's better not to store credit card credentials
         * in our DB, that's why the integration with, for example, PayPal is needed. After we have it, we won't need to
         * pass credentials but maybe some tokens together with banking info, I don't know what payment platforms demand.
         * */
        boolean success = true;

        if (success) {
            payment.setStatus(PaymentStatus.COMPLETED);
        } else {
            payment.setStatus(PaymentStatus.FAILED);
            /*
             * log, add to retrier, throw error
             * */
        }
        return payment;
    }


}
