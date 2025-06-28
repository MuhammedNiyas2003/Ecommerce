package com.ecommerce.ecommerce.model;

import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Seller {

    public enum STATUS {
        TRUE,
        FALSE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private STATUS status;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Product> products;

    @PrePersist
    public void prePersist() {
        if (status == null) {
            status = STATUS.TRUE;
        }
    }
}
