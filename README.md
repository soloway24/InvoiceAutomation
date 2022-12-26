Here are some notes that must be taken into consideration when creating such a product (Invoice Automation service)
(though I have intentionally omitted their implementation in code as all the code present in the repo is only a scheme).

1. Instead of a single POJO class for each entity the following should be used:
    - for each isolated application layer use a specific DTO class (e.g. PayerWebDto - controller layer, 
   PayerServiceDto - service layer, Payer - repo layer). Motivation: when you need to change a class for a one or some of 
   the layers in the future every layer will be affected. 
    - if a layer gets a DTO as a parameter or returns it as a result - it should be only a DTO specific to this layer
    - then use a mapper (e.g. Mapstruct mapper) to convert objects 
2. It's easier to integrate a payment platform (e.g. PayPal) into your application than save credit cards info as there are many 
restrictions and requirements on saving such sensitive information. 
   - for this reason there is a field 'billingToken' in the InvoiceOperation class.
3. All JPA annotations for establishing relationships between entities are omitted - they are explained in comments instead.
4. Entity annotations on entities are omitted in order not to cause compilation errors (not everything 
is configured for entities).
5. Repo, service and controller are omitted for Tariff and PaymentBankingInfo. They should be designed (if they need)
as those of other entities that need CRUD operations.
6. Validation of incoming parameters in methods is omitted.
7. PayPal is only a one example of various payment platforms that can be used. 
8. For Autowiring I'm using lombok and @RequiredArgsConstructor because Constructor Injection is better than 
Field Injection as it doesn't use reflection, and it's much easier for a developer to notice that a class has too many
dependencies when they use a Constructor with lots of parameters.
9. PayerBanService, repo and PayerBan entity are omitted. They are to be implemented the same way as those of other entities
that need crud operations.
10. All interface implementation names either start with "Basic" or with a specific prefix that explains what this 
implementation refers to. For example, PaymentPlatformService and PayPalService for a specific payment platform PayPay. 
