package org.example.grpc;

import java.util.List;
import java.util.stream.Collectors;
import org.example.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;

import net.devh.boot.grpc.server.service.GrpcService;
import employee.CreateEmployeeRequest;
import employee.CreateEmployeeResponse;
import employee.DeleteEmployeeRequest;
import employee.DeleteEmployeeResponse;
import employee.Employee;
import employee.EmployeeServiceGrpc;
import employee.GetAllEmployeesRequest;
import employee.GetAllEmployeesResponse;
import employee.UpdateEmployeeRequest;
import employee.UpdateEmployeeResponse;
import io.grpc.stub.StreamObserver;

@GrpcService
public class EmployeeService extends EmployeeServiceGrpc.EmployeeServiceImplBase {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(CreateEmployeeRequest request, StreamObserver<CreateEmployeeResponse> responseObserver) {
        EmployeeModel newEmployee = new EmployeeModel();
        newEmployee.setName(request.getName());
        newEmployee.setAge(request.getAge());
        newEmployee.setDepartment(request.getDepartment());
        employeeRepository.save(newEmployee);

        CreateEmployeeResponse response = CreateEmployeeResponse.newBuilder()
                .setId(newEmployee.getId())
                .setName(newEmployee.getName())
                .setAge(newEmployee.getAge())
                .setDepartment(newEmployee.getDepartment())
                .setMessage("Employee created successfully")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllEmployees(GetAllEmployeesRequest request, StreamObserver<GetAllEmployeesResponse> responseObserver) {
        List<EmployeeModel> employees = employeeRepository.findAll();
        GetAllEmployeesResponse response = GetAllEmployeesResponse.newBuilder()
                .addAllEmployees(employees.stream()
                        .map(this::toEmployeeProto)
                        .collect(Collectors.toList()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteEmployee(DeleteEmployeeRequest request, StreamObserver<DeleteEmployeeResponse> responseObserver) {
        int idToDelete = request.getId();
        if (employeeRepository.existsById(idToDelete)) {
            employeeRepository.deleteById(idToDelete);
            responseObserver.onNext(DeleteEmployeeResponse.newBuilder()
                    .setMessage("Employee with ID " + idToDelete + " deleted successfully")
                    .build());
        } else {
            responseObserver.onNext(DeleteEmployeeResponse.newBuilder()
                    .setMessage("Employee with ID " + idToDelete + " not found")
                    .build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void updateEmployee(UpdateEmployeeRequest request, StreamObserver<UpdateEmployeeResponse> responseObserver) {
        int idToUpdate = request.getId();
        if (employeeRepository.existsById(idToUpdate)) {
            EmployeeModel existingEmployee = employeeRepository.findById(idToUpdate).orElse(null);
            if (existingEmployee != null) {
                existingEmployee.setName(request.getName());
                existingEmployee.setAge(request.getAge());
                existingEmployee.setDepartment(request.getDepartment());
                employeeRepository.save(existingEmployee);

                responseObserver.onNext(UpdateEmployeeResponse.newBuilder()
                        .setMessage("Employee with ID " + idToUpdate + " updated successfully")
                        .build());
            }
        } else {
            responseObserver.onNext(UpdateEmployeeResponse.newBuilder()
                    .setMessage("Employee with ID " + idToUpdate + " not found")
                    .build());
        }
        responseObserver.onCompleted();
    }

    private Employee toEmployeeProto(EmployeeModel employeeModel) {
        return Employee.newBuilder()
                .setId(employeeModel.getId())
                .setName(employeeModel.getName())
                .setAge(employeeModel.getAge())
                .setDepartment(employeeModel.getDepartment())
                .build();
    }
}