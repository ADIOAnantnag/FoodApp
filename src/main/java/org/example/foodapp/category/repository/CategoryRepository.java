package org.example.foodapp.category.repository;

import org.example.foodapp.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
