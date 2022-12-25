package com.example.invoiceautomation.serivce.implementation;

import com.example.invoiceautomation.model.Payer;
import com.example.invoiceautomation.repository.PayerRepository;
import com.example.invoiceautomation.serivce.PayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasicPayerService implements PayerService {

    private final PayerRepository payerRepository;

    @Override
    public Payer create(Payer payer) {
        return payerRepository.save(payer);
    }

    /* rest of CRUD operations
     *
     *
     *
     */
}
