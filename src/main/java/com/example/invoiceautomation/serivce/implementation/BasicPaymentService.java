package com.example.invoiceautomation.serivce.implementation;

import com.example.invoiceautomation.model.InvoiceOperation;
import com.example.invoiceautomation.model.Payment;
import com.example.invoiceautomation.model.PaymentMode;
import com.example.invoiceautomation.model.PaymentStatus;
import com.example.invoiceautomation.repository.PaymentRepository;
import com.example.invoiceautomation.serivce.InvoiceOperationService;
import com.example.invoiceautomation.serivce.PaymentPlatformService;
import com.example.invoiceautomation.serivce.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class BasicPaymentService implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final InvoiceOperationService invoiceOperationService;
    // later use @Qualifier or another option to autowire a bean by its name
    private final PaymentPlatformService paymentPlatformService;

    @Override
    public Payment create(Long invoiceOperationId) {
        InvoiceOperation invoiceOperation = invoiceOperationService.getById(invoiceOperationId);
        Payment payment = new Payment(invoiceOperation, PaymentStatus.NEW, new Date());
        return paymentRepository.save(payment);
    }

    @Override
    public Payment completePayment(Payment payment) {
        return paymentPlatformService.completeTransaction(payment);
    }

    @Override
    public Payment createAndComplete(Long invoiceOperationId) {
        Payment created = create(invoiceOperationId);
        if (created.getInvoiceOperation().getPaymentMode().equals(PaymentMode.AUTOMATIC)) {
            return completePayment(created);
        }
        return created;
    }



    /* rest of CRUD operations
     *
     *
     *
     */
}
