package org.example.foodapp.menu.dtos;


import com.stripe.model.Review;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.example.foodapp.category.entity.Category;

import java.math.BigInteger;
import java.util.List;


public class MenuDTO {


    private String id;

    @NotBlank
    private String name;

    private String description;

    private BigInteger price;

    private String imageUrl;

    private Category category;


    private List<OrderItems>orderItems;


    private List<Review> reviews;


}
