package com.example.imagesusingspringbootgrpc.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Lob
    @Column(name = "image", columnDefinition = "LONGBLOB")
    byte[] image;
}
