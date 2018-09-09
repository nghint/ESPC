package org.o7plannng.sbshoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailInfo {
    private String id;

    private String productCode;
    private String productName;

    private int quanity;
    private double price;
    private double amount;
}
