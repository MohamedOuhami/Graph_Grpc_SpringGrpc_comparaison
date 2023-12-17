package com.ouhami.image_gallery_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ouhami.image_gallery_spring.entities.Image;

public interface ImageRepository extends JpaRepository<Image,Integer>{

} 