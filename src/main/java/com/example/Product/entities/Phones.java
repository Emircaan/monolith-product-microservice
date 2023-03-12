package com.example.Product.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "phones")
public class Phones {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    String brand;
    @Column
    String model;
    @Column
    int price;

}
