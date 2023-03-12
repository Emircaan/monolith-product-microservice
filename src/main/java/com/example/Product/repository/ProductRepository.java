package com.example.Product.repository;

import com.example.Product.entities.Phones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Phones,Integer> {
    Phones findById(int id);
}
