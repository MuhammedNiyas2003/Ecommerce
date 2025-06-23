package com.ecommerce.ecommerce.model;
import java.util.Map;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Cart {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int cartId;
    private int customerId;
    private Map<Integer,Integer> products;
}