package org.example.foodapp.order.dtos;

import jakarta.persistence.*;
import org.example.foodapp.auth_users.dtos.UserDTO;
import org.example.foodapp.auth_users.entity.User;
import org.example.foodapp.enums.OrderStatus;
import org.example.foodapp.enums.PaymentStatus;
import org.example.foodapp.order.entity.OrderItems;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class OrderDTO {

    private Long id;


    private LocalDateTime orderDate;

    private BigDecimal price;


    private UserDTO user;


    private List<OrderItemsDTO> orderItems;


    private Payment PaymentStatus;


    private PaymentStatus paymentStatus;


    private OrderStatus orderStatus;
}
