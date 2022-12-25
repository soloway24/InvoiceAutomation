package com.example.invoiceautomation.serivce.implementation;

import com.example.invoiceautomation.model.Payment;
import com.example.invoiceautomation.repository.PaymentRepository;
import com.example.invoiceautomation.serivce.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasicPaymentService implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public Payment create(Payment payment) {
        return paymentRepository.save(payment);
    }

    /* rest of CRUD operations
     *
     *
     *
     */
}
