package com.example.invoiceautomation.controller;

import com.example.invoiceautomation.model.Payer;
import com.example.invoiceautomation.serivce.PayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/payers")
@RequiredArgsConstructor
public class PayerController {

    private final PayerService payerService;

    @PostMapping
    public Payer create(@RequestBody Payer payer) {
        return payerService.create(payer);
    }


    /* rest of CRUD operations
    *
    *
    *
     */
}
