package org.example.foodapp.order.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.foodapp.auth_users.entity.User;
import org.example.foodapp.enums.OrderStatus;
import org.example.foodapp.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDateTime orderDate;

    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order_id",cascade = CascadeType.ALL)
    private List<OrderItems> orderItems;

    @OneToOne(mappedBy = "order_id",cascade = CascadeType.ALL)
    private Payment PaymentStatus;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
