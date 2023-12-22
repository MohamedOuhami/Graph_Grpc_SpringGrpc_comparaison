package com.ouhami.image_gallery_graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ouhami.image_gallery_graphql.entities.Image;

public interface ImageRepository extends JpaRepository<Image,Integer>{

} 