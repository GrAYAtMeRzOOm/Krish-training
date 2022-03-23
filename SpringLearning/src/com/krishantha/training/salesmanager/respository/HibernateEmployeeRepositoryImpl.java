package com.krishantha.training.salesmanager.respository;

import com.krishantha.training.salesmanager.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 23-Mar-22
 * Time: 9:45 AM
 * SpringLearning
 */
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setEmployeeName("Pasindu");
        employee.setEmployeeLocation("Horana");
        employeeList.add(employee);
        return employeeList;
    }
}
