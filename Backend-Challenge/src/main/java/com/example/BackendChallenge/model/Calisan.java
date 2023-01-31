package com.example.BackendChallenge.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@Builder
@Entity
@NoArgsConstructor
@Table(name = "calisan")
public class Calisan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "adSoyad")
    private String adSoyad;

    @Column(name = "firma")
    private String firma;
}
