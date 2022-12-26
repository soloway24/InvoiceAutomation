package com.example.invoiceautomation.serivce.implementation;

import com.example.invoiceautomation.model.InvoiceOperation;
import com.example.invoiceautomation.repository.InvoiceOperationRepository;
import com.example.invoiceautomation.serivce.InvoiceOperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasicInvoiceOperationService implements InvoiceOperationService {

    private final InvoiceOperationRepository invoiceOperationRepository;

    @Override
    public InvoiceOperation create(InvoiceOperation invoiceOperation) {
        return invoiceOperationRepository.save(invoiceOperation);
    }

    @Override
    public InvoiceOperation getById(Long id) {
        return invoiceOperationRepository.findById(id).orElseThrow(/* needs to throw a more specific exception + log */);
    }

    /* rest of CRUD operations
     *
     *
     *
     */
}
