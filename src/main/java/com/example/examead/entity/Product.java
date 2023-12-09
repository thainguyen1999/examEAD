package com.example.examead.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Table(name = "product")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodID;

    private String prodName;
    private String description;
    private LocalDate dateOfManf;
    private BigDecimal price;
    @OneToMany(mappedBy = "product")
    private List<Sale> sales;

}
