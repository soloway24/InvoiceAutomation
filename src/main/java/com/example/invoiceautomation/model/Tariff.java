package com.example.invoiceautomation.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Tariff {

    @Id
    private Long id;
    private String name;
    private Double price;
    // one Tariff to many InvoiceOperation
    private List<InvoiceOperation> invoiceOperations;

    /*
    other Tariff fields
    *
    *
     */
}
