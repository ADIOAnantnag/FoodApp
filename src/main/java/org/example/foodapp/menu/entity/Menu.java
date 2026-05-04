package org.example.foodapp.menu.entity;

import com.stripe.model.Review;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.example.foodapp.category.entity.Category;

import java.math.BigInteger;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    private String description;

    private BigInteger price;

    private String imageUrl;
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "category_id")
    private Category category;

@OneToMany(mappedBy = "menu",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private List<OrderItems>orderItems;

@OneToMany(mappedBy = "menu")
private List<Review> reviews;


}
