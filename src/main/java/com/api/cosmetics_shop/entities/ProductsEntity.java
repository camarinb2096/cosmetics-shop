package com.api.cosmetics_shop.entities;

import java.util.UUID;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductsEntity {
    private UUID id;
    private String name;
    private String category;
    private Double price;
    private Integer stock;
    private InvoiceEntity invoiceEntity;
}
