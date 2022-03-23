package com.krishantha.training.salesmanager.respository;

import com.krishantha.training.salesmanager.model.Employee;

import java.util.List;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 23-Mar-22
 * Time: 10:00 AM
 * SpringLearning
 */
public interface EmployeeRepository {
    public List<Employee> getAllEmployees();
}
