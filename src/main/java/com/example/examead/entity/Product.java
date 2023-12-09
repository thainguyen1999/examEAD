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
    @Column(name = "prodid")
    private Long prodID;
    @Column(name = "prod_name")
    private String prodName;
    @Column(name = "description")
    private String description;
    @Column(name = "date_of_manf")
    private LocalDate dateOfManf;
    @Column(name = "price")
    private BigDecimal price;

    @OneToMany(mappedBy = "product")
    private List<Sale> sales;

}
