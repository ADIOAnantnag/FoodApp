package org.example.foodapp.cart.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.example.foodapp.cart.entity.Cart;

import java.awt.*;
import java.math.BigDecimal;

@Data
@Entity
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    private Menu menu;
    private int quantity;
    private BigDecimal pricePerUnit;
    private BigDecimal totalPrice;





}
