package com.ecommerce.ecommerce.model;

import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

enum STATUS{
    TRUE,
    FLALSE
}
@Data
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = true)
    private String password;
    private STATUS status = STATUS.TRUE;
    @ManyToOne
    private List<Product> products;
}
