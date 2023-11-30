package com.example.imagesusingspringbootgrpc.service;


import com.example.imagesusingspringbootgrpc.entity.Image;
import com.example.imagesusingspringbootgrpc.repo.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {


    @Autowired
    ImageRepository imageRepository;


    public Image getImageById(int id){
        return imageRepository.findById(id).orElse(null);
    }

}
