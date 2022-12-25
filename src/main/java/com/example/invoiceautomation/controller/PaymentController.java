package com.example.invoiceautomation.controller;

import com.example.invoiceautomation.model.Payer;
import com.example.invoiceautomation.model.Payment;
import com.example.invoiceautomation.serivce.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/payers")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return paymentService.create(payment);
    }


    /* rest of CRUD operations
    *
    *
    *
     */
}
