package com.example.billingservice.model;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private double quantity;
    private double price;

}
