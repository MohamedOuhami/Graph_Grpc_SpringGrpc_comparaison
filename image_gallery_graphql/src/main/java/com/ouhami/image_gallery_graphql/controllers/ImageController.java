package com.ouhami.image_gallery_graphql.controllers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.ouhami.image_gallery_graphql.entities.Image;
import com.ouhami.image_gallery_graphql.repositories.ImageRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.POST })
@Controller
@RequestMapping("/graphql")
public class ImageController {

    @Autowired
    public ImageRepository imageRepository;

    @QueryMapping
    Iterable<Image> images() {
        List<Image> allImages = imageRepository.findAll();
        for (Image image : allImages) {
            try {
                String base64Content = convertBlobToBase64(image.getImageData());
                image.setImageDataString(base64Content);
            } catch (SQLException e) {
                // Handle error or skip the image
            }
        }
        return allImages;
    }
    
    // ImageController.java

    // ImageController.java

    @QueryMapping
    Image imageById(@Argument Integer id) {
        Optional<Image> optionalImage = imageRepository.findById(id);
        if (optionalImage.isPresent()) {
            Image image = optionalImage.get();
            try {
                String base64Content = convertBlobToBase64(image.getImageData());
                image.setImageDataString(base64Content);
                return image;
            } catch (SQLException e) {
                return null;
            }
        } else {
            return null; // Handle not found case
        }
    }

    // @MutationMapping
    // public Image createImage(@Argument ImageInput imageInput) {
    // try {
    // Blob blob = createBlobFromBase64(imageInput.getImageData());
    // Image image = new Image(null, blob);
    // Image savedImage = imageRepository.save(image);
    // return new Image(savedImage.getId(),
    // convertBlobToBase64(savedImage.getImageData()));
    // } catch (Exception e) {
    // e.printStackTrace();
    // return null; // Handle error case
    // }
    // }

    // Existing code...

    private static Blob createBlobFromBase64(String base64Data) throws IOException, SQLException {
        byte[] data = Base64.getDecoder().decode(base64Data);
        return new SerialBlob(data);
    }

    private static String convertBlobToBase64(Blob blob) throws SQLException {
        try (InputStream inputStream = blob.getBinaryStream();
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            return Base64.getEncoder().encodeToString(outputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("Error converting Blob to base64", e);
        }
    }
}
