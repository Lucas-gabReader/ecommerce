package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_orderitem")
public class Orderitem {
    @EmbeddedId
    private OrderitemPK orderitemPK;

    private int quantity;
    private double price;

}
