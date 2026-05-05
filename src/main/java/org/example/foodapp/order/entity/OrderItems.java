package org.example.foodapp.order.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.foodapp.auth_users.entity.User;
import org.example.foodapp.enums.OrderStatus;
import org.example.foodapp.enums.PaymentStatus;
import org.example.foodapp.menu.entity.Menu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "order_id")
   private Order order;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "menu")
   private Menu menu;

   private int quantity;

   private BigDecimal pricePerUnit;

   private BigDecimal subTotal;



}
