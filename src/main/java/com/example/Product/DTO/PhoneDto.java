package com.example.Product.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhoneDto {
    private int id;
    private String brand;
    private String model;
    private int price;
}
