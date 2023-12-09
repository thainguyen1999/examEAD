package com.example.examead.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "sale")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slNo;

    private Long salesmanID;
   @ManyToOne
   @JoinColumn(name = "prodID")
   @JsonIgnore
    private Product product;
    private String salesmanName;
    private LocalDate DOS;
}
