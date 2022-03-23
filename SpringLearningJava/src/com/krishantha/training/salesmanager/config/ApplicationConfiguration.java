package com.krishantha.training.salesmanager.config;

import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.*;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 23-Mar-22
 * Time: 6:40 PM
 * SpringLearningJava
 */
@Configuration
@ComponentScan("com.krishantha")
@PropertySource("../application.properties")
public class ApplicationConfiguration {

    @Bean("employeeService")
//    @Scope("singleton")
    @Scope("prototype")
    public EmployeeService getEmployeeService() {
//        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
//        employeeService.setEmployeeRepository(getEmployeeRepository());
        return new EmployeeServiceImpl();
    }
    /*@Bean("employeeRepository")
    public EmployeeRepository getEmployeeRepository() {
        return new HibernateEmployeeRepositoryImpl();
    }*/

}
