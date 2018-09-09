package org.spc.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Orders", uniqueConstraints = {@UniqueConstraint(columnNames = "ORDER_NUM")})
@Data
public class Order {
    @Id
    @Column(name = "ID", length = 50)
    private String id;

    @Column(name = "ORDER_DATE", nullable = false)
    private Date orderDate;

    @Column(name = "ORDER_NUM", nullable = false)
    private int orderNum;

    @Column(name = "AMOUNT", nullable = false)
    private double amount;

    @Column(name = "CUSTOMER_NAME", length = 255, nullable = false)
    private String customerName;

    @Column(name = "CUSTOMER_ADDRESS", length = 255, nullable = false)
    private String customerAddress;

    @Column(name = "CUSTOMER_EMAIL", length = 128, nullable = false)
    private String customerEmail;

    @Column(name = "CUSTOMER_PHONE", length = 128, nullable = false)
    private String customerPhone;
}
