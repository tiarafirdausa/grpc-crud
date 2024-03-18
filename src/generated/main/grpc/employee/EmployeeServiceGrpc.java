package employee;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "employee.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<employee.CreateEmployeeRequest,
      employee.CreateEmployeeResponse> getCreateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmployee",
      requestType = employee.CreateEmployeeRequest.class,
      responseType = employee.CreateEmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<employee.CreateEmployeeRequest,
      employee.CreateEmployeeResponse> getCreateEmployeeMethod() {
    io.grpc.MethodDescriptor<employee.CreateEmployeeRequest, employee.CreateEmployeeResponse> getCreateEmployeeMethod;
    if ((getCreateEmployeeMethod = EmployeeServiceGrpc.getCreateEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getCreateEmployeeMethod = EmployeeServiceGrpc.getCreateEmployeeMethod) == null) {
          EmployeeServiceGrpc.getCreateEmployeeMethod = getCreateEmployeeMethod =
              io.grpc.MethodDescriptor.<employee.CreateEmployeeRequest, employee.CreateEmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.CreateEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.CreateEmployeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("CreateEmployee"))
              .build();
        }
      }
    }
    return getCreateEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<employee.GetAllEmployeesRequest,
      employee.GetAllEmployeesResponse> getGetAllEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllEmployees",
      requestType = employee.GetAllEmployeesRequest.class,
      responseType = employee.GetAllEmployeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<employee.GetAllEmployeesRequest,
      employee.GetAllEmployeesResponse> getGetAllEmployeesMethod() {
    io.grpc.MethodDescriptor<employee.GetAllEmployeesRequest, employee.GetAllEmployeesResponse> getGetAllEmployeesMethod;
    if ((getGetAllEmployeesMethod = EmployeeServiceGrpc.getGetAllEmployeesMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetAllEmployeesMethod = EmployeeServiceGrpc.getGetAllEmployeesMethod) == null) {
          EmployeeServiceGrpc.getGetAllEmployeesMethod = getGetAllEmployeesMethod =
              io.grpc.MethodDescriptor.<employee.GetAllEmployeesRequest, employee.GetAllEmployeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.GetAllEmployeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.GetAllEmployeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("GetAllEmployees"))
              .build();
        }
      }
    }
    return getGetAllEmployeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<employee.DeleteEmployeeRequest,
      employee.DeleteEmployeeResponse> getDeleteEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEmployee",
      requestType = employee.DeleteEmployeeRequest.class,
      responseType = employee.DeleteEmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<employee.DeleteEmployeeRequest,
      employee.DeleteEmployeeResponse> getDeleteEmployeeMethod() {
    io.grpc.MethodDescriptor<employee.DeleteEmployeeRequest, employee.DeleteEmployeeResponse> getDeleteEmployeeMethod;
    if ((getDeleteEmployeeMethod = EmployeeServiceGrpc.getDeleteEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getDeleteEmployeeMethod = EmployeeServiceGrpc.getDeleteEmployeeMethod) == null) {
          EmployeeServiceGrpc.getDeleteEmployeeMethod = getDeleteEmployeeMethod =
              io.grpc.MethodDescriptor.<employee.DeleteEmployeeRequest, employee.DeleteEmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.DeleteEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.DeleteEmployeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("DeleteEmployee"))
              .build();
        }
      }
    }
    return getDeleteEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<employee.UpdateEmployeeRequest,
      employee.UpdateEmployeeResponse> getUpdateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmployee",
      requestType = employee.UpdateEmployeeRequest.class,
      responseType = employee.UpdateEmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<employee.UpdateEmployeeRequest,
      employee.UpdateEmployeeResponse> getUpdateEmployeeMethod() {
    io.grpc.MethodDescriptor<employee.UpdateEmployeeRequest, employee.UpdateEmployeeResponse> getUpdateEmployeeMethod;
    if ((getUpdateEmployeeMethod = EmployeeServiceGrpc.getUpdateEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getUpdateEmployeeMethod = EmployeeServiceGrpc.getUpdateEmployeeMethod) == null) {
          EmployeeServiceGrpc.getUpdateEmployeeMethod = getUpdateEmployeeMethod =
              io.grpc.MethodDescriptor.<employee.UpdateEmployeeRequest, employee.UpdateEmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.UpdateEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  employee.UpdateEmployeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("UpdateEmployee"))
              .build();
        }
      }
    }
    return getUpdateEmployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub>() {
        @java.lang.Override
        public EmployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceStub(channel, callOptions);
        }
      };
    return EmployeeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub>() {
        @java.lang.Override
        public EmployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub>() {
        @java.lang.Override
        public EmployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceFutureStub(channel, callOptions);
        }
      };
    return EmployeeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createEmployee(employee.CreateEmployeeRequest request,
        io.grpc.stub.StreamObserver<employee.CreateEmployeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void getAllEmployees(employee.GetAllEmployeesRequest request,
        io.grpc.stub.StreamObserver<employee.GetAllEmployeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllEmployeesMethod(), responseObserver);
    }

    /**
     */
    public void deleteEmployee(employee.DeleteEmployeeRequest request,
        io.grpc.stub.StreamObserver<employee.DeleteEmployeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void updateEmployee(employee.UpdateEmployeeRequest request,
        io.grpc.stub.StreamObserver<employee.UpdateEmployeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmployeeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEmployeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                employee.CreateEmployeeRequest,
                employee.CreateEmployeeResponse>(
                  this, METHODID_CREATE_EMPLOYEE)))
          .addMethod(
            getGetAllEmployeesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                employee.GetAllEmployeesRequest,
                employee.GetAllEmployeesResponse>(
                  this, METHODID_GET_ALL_EMPLOYEES)))
          .addMethod(
            getDeleteEmployeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                employee.DeleteEmployeeRequest,
                employee.DeleteEmployeeResponse>(
                  this, METHODID_DELETE_EMPLOYEE)))
          .addMethod(
            getUpdateEmployeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                employee.UpdateEmployeeRequest,
                employee.UpdateEmployeeResponse>(
                  this, METHODID_UPDATE_EMPLOYEE)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceStub> {
    private EmployeeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createEmployee(employee.CreateEmployeeRequest request,
        io.grpc.stub.StreamObserver<employee.CreateEmployeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllEmployees(employee.GetAllEmployeesRequest request,
        io.grpc.stub.StreamObserver<employee.GetAllEmployeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllEmployeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEmployee(employee.DeleteEmployeeRequest request,
        io.grpc.stub.StreamObserver<employee.DeleteEmployeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmployee(employee.UpdateEmployeeRequest request,
        io.grpc.stub.StreamObserver<employee.UpdateEmployeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public employee.CreateEmployeeResponse createEmployee(employee.CreateEmployeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public employee.GetAllEmployeesResponse getAllEmployees(employee.GetAllEmployeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllEmployeesMethod(), getCallOptions(), request);
    }

    /**
     */
    public employee.DeleteEmployeeResponse deleteEmployee(employee.DeleteEmployeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public employee.UpdateEmployeeResponse updateEmployee(employee.UpdateEmployeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<employee.CreateEmployeeResponse> createEmployee(
        employee.CreateEmployeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<employee.GetAllEmployeesResponse> getAllEmployees(
        employee.GetAllEmployeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllEmployeesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<employee.DeleteEmployeeResponse> deleteEmployee(
        employee.DeleteEmployeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<employee.UpdateEmployeeResponse> updateEmployee(
        employee.UpdateEmployeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EMPLOYEE = 0;
  private static final int METHODID_GET_ALL_EMPLOYEES = 1;
  private static final int METHODID_DELETE_EMPLOYEE = 2;
  private static final int METHODID_UPDATE_EMPLOYEE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_EMPLOYEE:
          serviceImpl.createEmployee((employee.CreateEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<employee.CreateEmployeeResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_EMPLOYEES:
          serviceImpl.getAllEmployees((employee.GetAllEmployeesRequest) request,
              (io.grpc.stub.StreamObserver<employee.GetAllEmployeesResponse>) responseObserver);
          break;
        case METHODID_DELETE_EMPLOYEE:
          serviceImpl.deleteEmployee((employee.DeleteEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<employee.DeleteEmployeeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMPLOYEE:
          serviceImpl.updateEmployee((employee.UpdateEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<employee.UpdateEmployeeResponse>) responseObserver);
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

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return employee.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getCreateEmployeeMethod())
              .addMethod(getGetAllEmployeesMethod())
              .addMethod(getDeleteEmployeeMethod())
              .addMethod(getUpdateEmployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
