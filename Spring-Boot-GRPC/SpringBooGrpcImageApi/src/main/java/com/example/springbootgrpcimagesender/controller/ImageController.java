package com.example.springbootgrpcimagesender.controller;
import com.example.springbootgrpcimagesender.service.GrpcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/images")
@CrossOrigin("*")
public class ImageController {

    @Autowired
    private GrpcClientService grpcClientService;


    @GetMapping("/stream/{id}")
    public Flux<byte[]> streamImageChunks(@PathVariable int id) {
        return grpcClientService.imageChunkStrem(id)
                .map(imageChunk -> imageChunk.getChunkData().toByteArray());
    }
}

