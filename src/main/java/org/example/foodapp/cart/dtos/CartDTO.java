package org.example.foodapp.cart.dtos;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.foodapp.auth_users.entity.User;
import org.example.foodapp.cart.entity.CartItems;

import java.util.List;

@Builder

@Data

public class CartDTO {

    private Long cartId;


    private User user;


    private List<CartItems> cartItems;

    private String promoCode;
}
