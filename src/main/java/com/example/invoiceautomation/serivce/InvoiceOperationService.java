package com.example.invoiceautomation.serivce;

import com.example.invoiceautomation.model.InvoiceOperation;

public interface InvoiceOperationService {

    InvoiceOperation create(InvoiceOperation invoiceOperation);
    InvoiceOperation getById(Long id);


    /* rest of CRUD operations
     *
     *
     *
     */
}
