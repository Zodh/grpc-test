package generated;

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
    comments = "Source: person.proto")
public final class personGrpc {

  private personGrpc() {}

  public static final String SERVICE_NAME = "proto.person";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.Message,
      generated.Message> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greet",
      requestType = generated.Message.class,
      responseType = generated.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Message,
      generated.Message> getGreetMethod() {
    io.grpc.MethodDescriptor<generated.Message, generated.Message> getGreetMethod;
    if ((getGreetMethod = personGrpc.getGreetMethod) == null) {
      synchronized (personGrpc.class) {
        if ((getGreetMethod = personGrpc.getGreetMethod) == null) {
          personGrpc.getGreetMethod = getGreetMethod = 
              io.grpc.MethodDescriptor.<generated.Message, generated.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.person", "greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Message.getDefaultInstance()))
                  .setSchemaDescriptor(new personMethodDescriptorSupplier("greet"))
                  .build();
          }
        }
     }
     return getGreetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static personStub newStub(io.grpc.Channel channel) {
    return new personStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static personBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new personBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static personFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new personFutureStub(channel);
  }

  /**
   */
  public static abstract class personImplBase implements io.grpc.BindableService {

    /**
     */
    public void greet(generated.Message request,
        io.grpc.stub.StreamObserver<generated.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Message,
                generated.Message>(
                  this, METHODID_GREET)))
          .build();
    }
  }

  /**
   */
  public static final class personStub extends io.grpc.stub.AbstractStub<personStub> {
    private personStub(io.grpc.Channel channel) {
      super(channel);
    }

    private personStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected personStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new personStub(channel, callOptions);
    }

    /**
     */
    public void greet(generated.Message request,
        io.grpc.stub.StreamObserver<generated.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class personBlockingStub extends io.grpc.stub.AbstractStub<personBlockingStub> {
    private personBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private personBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected personBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new personBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.Message greet(generated.Message request) {
      return blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class personFutureStub extends io.grpc.stub.AbstractStub<personFutureStub> {
    private personFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private personFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected personFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new personFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Message> greet(
        generated.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final personImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(personImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((generated.Message) request,
              (io.grpc.stub.StreamObserver<generated.Message>) responseObserver);
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

  private static abstract class personBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    personBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.PersonProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("person");
    }
  }

  private static final class personFileDescriptorSupplier
      extends personBaseDescriptorSupplier {
    personFileDescriptorSupplier() {}
  }

  private static final class personMethodDescriptorSupplier
      extends personBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    personMethodDescriptorSupplier(String methodName) {
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
      synchronized (personGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new personFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
