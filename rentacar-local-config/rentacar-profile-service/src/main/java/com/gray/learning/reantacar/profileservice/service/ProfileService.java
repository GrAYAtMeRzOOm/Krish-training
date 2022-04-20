package com.gray.learning.reantacar.profileservice.service;

import com.gray.learning.rentacar.commons.model.Customer;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 20-Apr-22
 * Time: 7:47 PM
 * rentacar-profile-service
 */
@Service
public interface ProfileService {
    public Customer save(Customer customer);
}
