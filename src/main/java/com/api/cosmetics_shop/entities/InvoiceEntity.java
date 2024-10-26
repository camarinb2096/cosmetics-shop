package com.api.cosmetics_shop.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InvoiceEntity {
    private UUID id;
    private CustomerEntity customerEntity;
    private BuyersEntity buyersEntity;
    private List<ProductsEntity> productsEntity;
    private Date date;
    private Double totalAmount;
}
