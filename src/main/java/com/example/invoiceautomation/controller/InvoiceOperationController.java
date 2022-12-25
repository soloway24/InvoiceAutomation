package com.example.invoiceautomation.controller;

import com.example.invoiceautomation.model.InvoiceOperation;
import com.example.invoiceautomation.serivce.InvoiceOperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/invoice-operations")
@RequiredArgsConstructor
public class InvoiceOperationController {

    private final InvoiceOperationService invoiceOperationService;

    @PostMapping
    public InvoiceOperation create(@RequestBody InvoiceOperation invoiceOperation) {
        return invoiceOperationService.create(invoiceOperation);
    }


    /* rest of CRUD operations
    *
    *
    *
     */
}
