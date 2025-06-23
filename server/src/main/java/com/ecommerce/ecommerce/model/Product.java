package com.ecommerce.ecommerce.model;
import java.util.List;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int productId;
    @JoinColumn(nullable = false)
    @ManyToOne(cascade=CascadeType.ALL)
    private Seller seller;
    private String productName;
    @Column(nullable = false)
    private int quantity = 0;
    private List<String> productImages;
    @Column(nullable = false)
    private double price;
    private String description;
}