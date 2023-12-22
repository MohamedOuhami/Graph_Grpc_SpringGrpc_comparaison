package com.ouhami.image_gallery_spring.controllers;

import com.ouhami.image_gallery_spring.entities.Image;
import com.ouhami.image_gallery_spring.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/images")
public class ImageController {

    @Autowired
    public ImageRepository imageRepository;

    // Get all images
    @GetMapping
    public List<Image> getAllImages() {
        System.out.println(imageRepository.findAll());
        return imageRepository.findAll();
    }

    // Get image by ID
    @GetMapping("/{id}")
    public ResponseEntity<Image> getImageById(@PathVariable Integer id) {
        Optional<Image> imageOptional = imageRepository.findById(id);
        return imageOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new image
    @PostMapping
    public Image createImage(@RequestBody Image image) {
        System.out.println(image);
        return imageRepository.save(image);
    }

    // Update an existing image
    @PutMapping("/{id}")
    public ResponseEntity<Image> updateImage(@PathVariable Integer id, @RequestBody Image updatedImage) {
        Optional<Image> existingImageOptional = imageRepository.findById(id);

        if (existingImageOptional.isPresent()) {
            Image existingImage = existingImageOptional.get();
            existingImage.setImageData(updatedImage.getImageData()); // Update other fields as needed
            return ResponseEntity.ok(imageRepository.save(existingImage));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete an image by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable Integer id) {
        if (imageRepository.existsById(id)) {
            imageRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
