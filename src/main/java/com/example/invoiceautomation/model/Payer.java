package com.example.invoiceautomation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Payer {

    @Id
    private Long id;
    private String name;
    private String phone;
    private String email;

    // one Payer to many InvoiceOperation
    private List<InvoiceOperation> invoiceOperations;
}
