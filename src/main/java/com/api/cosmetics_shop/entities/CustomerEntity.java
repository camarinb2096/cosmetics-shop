package com.api.cosmetics_shop.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {
    private UUID id;
    private String name;
    private String email;
    private String phone;
    private List<InvoiceEntity> invoices;
}
