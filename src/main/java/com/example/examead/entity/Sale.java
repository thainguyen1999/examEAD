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
    @Column(name = "sl_no")
    private Long slNo;
    @Column(name = "salesmanid")
    private Long salesmanID;
   @ManyToOne
   @JoinColumn(name = "prodID")
   @JsonIgnore
    private Product product;
    @Column(name = "salesman_name")
    private String salesmanName;
    @Column(name = "dos")
    private LocalDate DOS;
}
