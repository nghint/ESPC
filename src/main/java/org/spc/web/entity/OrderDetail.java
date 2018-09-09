package org.spc.web.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Order_Details")
@Data
public class OrderDetail {
    @Id
    @Column(name = "ID", length = 50, nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID", nullable = false, foreignKey = @ForeignKey(name = "ORDER_DETAIL_ORD_FK"))
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", nullable = false, foreignKey = @ForeignKey(name = "ORDER_DETAIL_PROD_FK"))
    private Product product;

    @Column(name = "QUANITY", nullable = false)
    private int quanity;

    @Column(name = "PRICE", nullable = false)
    private double price;

    @Column(name = "AMOUNT", nullable = false)
    private double amount;
}
