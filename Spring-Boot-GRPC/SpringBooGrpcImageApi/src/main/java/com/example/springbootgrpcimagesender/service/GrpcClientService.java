package com.example.springbootgrpcimagesender.service;


import com.othman.grpc.stubs.ImageServiceGrpc;
import com.othman.grpc.stubs.Images;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GrpcClientService {


    @GrpcClient("service")
    ImageServiceGrpc.ImageServiceStub imageServiceStub;


    public Flux<Images.ImageChunk> imageChunkStrem(int imageId){


        return Flux.create(emitter->{
            imageServiceStub.streamImageChunks(Images.StreamImageRequest.newBuilder()
                            .setId(imageId)
                            .build()
                    ,
                    new StreamObserver<>() {
                        @Override
                        public void onNext(Images.ImageChunk imageChunk) {

                            emitter.next(imageChunk);
                        }

                        @Override
                        public void onError(Throwable throwable) {
                            emitter.error(throwable);
                        }

                        @Override
                        public void onCompleted() {
                            emitter.complete();

                        }
                    }
            );
        });

    }

}
