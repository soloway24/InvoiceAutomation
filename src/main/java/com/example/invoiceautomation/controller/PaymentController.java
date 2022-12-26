package com.example.invoiceautomation.controller;

import com.example.invoiceautomation.model.Payment;
import com.example.invoiceautomation.serivce.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public Payment addPayment(@RequestBody Long invoiceOperationId) {
        return paymentService.createAndComplete(invoiceOperationId);
    }


    /* rest of CRUD operations
    *
    *
    *
     */
}
