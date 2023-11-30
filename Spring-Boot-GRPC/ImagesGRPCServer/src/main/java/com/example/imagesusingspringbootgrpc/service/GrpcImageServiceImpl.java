package com.example.imagesusingspringbootgrpc.service;

import com.example.imagesusingspringbootgrpc.entity.Image;
import com.google.protobuf.ByteString;
import com.othman.grpc.stubs.ImageServiceGrpc;
import com.othman.grpc.stubs.Images;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Base64;

@GrpcService
public class GrpcImageServiceImpl extends ImageServiceGrpc.ImageServiceImplBase {

    @Autowired
    ImageService imageService;
    @Override
    public void streamImageChunks(Images.StreamImageRequest request, StreamObserver<Images.ImageChunk> responseObserver) {
        try {
            int imageId = request.getId();
            Image image = imageService.getImageById(imageId);

            if (image == null) {
                throw new Exception("That image doesn't exist");
            }

            byte[] imageData = image.getImage();



            Images.ImageChunk imageChunk = Images.ImageChunk.newBuilder()
                    .setChunkData(ByteString.copyFrom(imageData))
                    .build();
            responseObserver.onNext(imageChunk);
            /*int chunkSize = 1024;

            for (int i = 0; i < imageData.length; i += chunkSize) {
                int end = Math.min(i + chunkSize, imageData.length-1);
                byte[] chunkData = Arrays.copyOfRange(imageData, i, end);

                // Encode the chunkData using Base6

                Images.ImageChunk chunk = Images.ImageChunk.newBuilder()
                        .setChunkData(ByteString.copyFrom(chunkData))
                        .build();

                responseObserver.onNext(chunk);
            }*/
        } catch (Exception e) {
            responseObserver.onError(Status.UNKNOWN.withDescription(e.getMessage()).asRuntimeException());
        }
        responseObserver.onCompleted();
    }

}
