package org.example.foodapp.cart.dtos;



import lombok.Data;
import org.example.foodapp.cart.entity.Cart;

import java.awt.*;
import java.math.BigDecimal;

@Data

public class cartItemsDTO {

    private Long id;


    private Cart cart;

    private Menu menu;
    private int quantity;
    private BigDecimal pricePerUnit;
    private BigDecimal totalPrice;





}

