package com.othman.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: images.proto")
public final class ImageServiceGrpc {

  private ImageServiceGrpc() {}

  public static final String SERVICE_NAME = "ImageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.othman.grpc.stubs.Images.StreamImageRequest,
      com.othman.grpc.stubs.Images.ImageChunk> getStreamImageChunksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamImageChunks",
      requestType = com.othman.grpc.stubs.Images.StreamImageRequest.class,
      responseType = com.othman.grpc.stubs.Images.ImageChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.othman.grpc.stubs.Images.StreamImageRequest,
      com.othman.grpc.stubs.Images.ImageChunk> getStreamImageChunksMethod() {
    io.grpc.MethodDescriptor<com.othman.grpc.stubs.Images.StreamImageRequest, com.othman.grpc.stubs.Images.ImageChunk> getStreamImageChunksMethod;
    if ((getStreamImageChunksMethod = ImageServiceGrpc.getStreamImageChunksMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getStreamImageChunksMethod = ImageServiceGrpc.getStreamImageChunksMethod) == null) {
          ImageServiceGrpc.getStreamImageChunksMethod = getStreamImageChunksMethod = 
              io.grpc.MethodDescriptor.<com.othman.grpc.stubs.Images.StreamImageRequest, com.othman.grpc.stubs.Images.ImageChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ImageService", "StreamImageChunks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.othman.grpc.stubs.Images.StreamImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.othman.grpc.stubs.Images.ImageChunk.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("StreamImageChunks"))
                  .build();
          }
        }
     }
     return getStreamImageChunksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageServiceStub newStub(io.grpc.Channel channel) {
    return new ImageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImageServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void streamImageChunks(com.othman.grpc.stubs.Images.StreamImageRequest request,
        io.grpc.stub.StreamObserver<com.othman.grpc.stubs.Images.ImageChunk> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamImageChunksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamImageChunksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.othman.grpc.stubs.Images.StreamImageRequest,
                com.othman.grpc.stubs.Images.ImageChunk>(
                  this, METHODID_STREAM_IMAGE_CHUNKS)))
          .build();
    }
  }

  /**
   */
  public static final class ImageServiceStub extends io.grpc.stub.AbstractStub<ImageServiceStub> {
    private ImageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageServiceStub(channel, callOptions);
    }

    /**
     */
    public void streamImageChunks(com.othman.grpc.stubs.Images.StreamImageRequest request,
        io.grpc.stub.StreamObserver<com.othman.grpc.stubs.Images.ImageChunk> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamImageChunksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImageServiceBlockingStub extends io.grpc.stub.AbstractStub<ImageServiceBlockingStub> {
    private ImageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.othman.grpc.stubs.Images.ImageChunk> streamImageChunks(
        com.othman.grpc.stubs.Images.StreamImageRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamImageChunksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImageServiceFutureStub extends io.grpc.stub.AbstractStub<ImageServiceFutureStub> {
    private ImageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_IMAGE_CHUNKS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_IMAGE_CHUNKS:
          serviceImpl.streamImageChunks((com.othman.grpc.stubs.Images.StreamImageRequest) request,
              (io.grpc.stub.StreamObserver<com.othman.grpc.stubs.Images.ImageChunk>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.othman.grpc.stubs.Images.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageService");
    }
  }

  private static final class ImageServiceFileDescriptorSupplier
      extends ImageServiceBaseDescriptorSupplier {
    ImageServiceFileDescriptorSupplier() {}
  }

  private static final class ImageServiceMethodDescriptorSupplier
      extends ImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageServiceFileDescriptorSupplier())
              .addMethod(getStreamImageChunksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
