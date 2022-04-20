package com.gray.learning.reantacar.profileservice.service.impl;

import com.gray.learning.reantacar.profileservice.repository.ProfileRepository;
import com.gray.learning.reantacar.profileservice.service.ProfileService;
import com.gray.learning.rentacar.commons.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 20-Apr-22
 * Time: 7:49 PM
 * rentacar-profile-service
 */
@Service
public class ProfileServiceImpl implements ProfileService {
    ProfileRepository profileRepository;

    @Autowired
    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Customer save(Customer customer) {
       return profileRepository.save(customer);
    }
}
