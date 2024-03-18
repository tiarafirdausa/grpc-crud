// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package employee;

public final class EmployeeOuterClass {
  private EmployeeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employee_CreateEmployeeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employee_CreateEmployeeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employee_CreateEmployeeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employee_CreateEmployeeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employee_Employee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employee_Employee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employee_GetAllEmployeesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employee_GetAllEmployeesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employee_GetAllEmployeesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employee_GetAllEmployeesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employee_DeleteEmployeeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employee_DeleteEmployeeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employee_DeleteEmployeeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employee_DeleteEmployeeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employee_UpdateEmployeeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employee_UpdateEmployeeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_employee_UpdateEmployeeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_employee_UpdateEmployeeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016employee.proto\022\010employee\"F\n\025CreateEmpl" +
      "oyeeRequest\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\022" +
      "\n\ndepartment\030\003 \001(\t\"d\n\026CreateEmployeeResp" +
      "onse\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\013\n\003age\030\003 " +
      "\001(\005\022\022\n\ndepartment\030\004 \001(\t\022\017\n\007message\030\005 \001(\t" +
      "\"E\n\010Employee\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\013" +
      "\n\003age\030\003 \001(\005\022\022\n\ndepartment\030\004 \001(\t\"\030\n\026GetAl" +
      "lEmployeesRequest\"@\n\027GetAllEmployeesResp" +
      "onse\022%\n\temployees\030\001 \003(\0132\022.employee.Emplo" +
      "yee\"#\n\025DeleteEmployeeRequest\022\n\n\002id\030\001 \001(\005" +
      "\")\n\026DeleteEmployeeResponse\022\017\n\007message\030\001 " +
      "\001(\t\"R\n\025UpdateEmployeeRequest\022\n\n\002id\030\001 \001(\005" +
      "\022\014\n\004name\030\002 \001(\t\022\013\n\003age\030\003 \001(\005\022\022\n\ndepartmen" +
      "t\030\004 \001(\t\")\n\026UpdateEmployeeResponse\022\017\n\007mes" +
      "sage\030\001 \001(\t2\350\002\n\017EmployeeService\022S\n\016Create" +
      "Employee\022\037.employee.CreateEmployeeReques" +
      "t\032 .employee.CreateEmployeeResponse\022V\n\017G" +
      "etAllEmployees\022 .employee.GetAllEmployee" +
      "sRequest\032!.employee.GetAllEmployeesRespo" +
      "nse\022S\n\016DeleteEmployee\022\037.employee.DeleteE" +
      "mployeeRequest\032 .employee.DeleteEmployee" +
      "Response\022S\n\016UpdateEmployee\022\037.employee.Up" +
      "dateEmployeeRequest\032 .employee.UpdateEmp" +
      "loyeeResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_employee_CreateEmployeeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_employee_CreateEmployeeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employee_CreateEmployeeRequest_descriptor,
        new java.lang.String[] { "Name", "Age", "Department", });
    internal_static_employee_CreateEmployeeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_employee_CreateEmployeeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employee_CreateEmployeeResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Age", "Department", "Message", });
    internal_static_employee_Employee_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_employee_Employee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employee_Employee_descriptor,
        new java.lang.String[] { "Id", "Name", "Age", "Department", });
    internal_static_employee_GetAllEmployeesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_employee_GetAllEmployeesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employee_GetAllEmployeesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_employee_GetAllEmployeesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_employee_GetAllEmployeesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employee_GetAllEmployeesResponse_descriptor,
        new java.lang.String[] { "Employees", });
    internal_static_employee_DeleteEmployeeRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_employee_DeleteEmployeeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employee_DeleteEmployeeRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_employee_DeleteEmployeeResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_employee_DeleteEmployeeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employee_DeleteEmployeeResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_employee_UpdateEmployeeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_employee_UpdateEmployeeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employee_UpdateEmployeeRequest_descriptor,
        new java.lang.String[] { "Id", "Name", "Age", "Department", });
    internal_static_employee_UpdateEmployeeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_employee_UpdateEmployeeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_employee_UpdateEmployeeResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
