package com.senai.ecommerce.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_orderitem")
public class Orderitem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;


}
