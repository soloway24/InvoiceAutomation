package com.example.invoiceautomation.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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
