package tech.reliab.course.grinchenkoas.bank.service;

import tech.reliab.course.grinchenkoas.bank.entity.Employee;
import tech.reliab.course.grinchenkoas.bank.model.EmployeeRequest;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(EmployeeRequest employeeRequest);

    Employee getEmployeeDtoById(int id);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployees();

    Employee updateEmployee(int id, String name);

    void deleteEmployee(int id);
}
