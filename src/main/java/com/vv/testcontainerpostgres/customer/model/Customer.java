package com.vv.testcontainerpostgres.customer.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    private Integer id;
    private String  name;
}