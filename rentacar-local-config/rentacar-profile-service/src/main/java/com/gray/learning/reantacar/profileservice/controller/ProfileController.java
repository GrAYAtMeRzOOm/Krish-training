package com.gray.learning.reantacar.profileservice.controller;

import com.gray.learning.reantacar.profileservice.service.ProfileService;
import com.gray.learning.rentacar.commons.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 20-Apr-22
 * Time: 7:39 PM
 * rentacar-profile-service
 */
@RestController
@RequestMapping("/service")
public class ProfileController {

     ProfileService profileService;

     @Autowired
     public ProfileController(ProfileService profileService) {
          this.profileService = profileService;
     }

     public ResponseEntity<Customer> save(@RequestBody Customer customer){
        return   ResponseEntity.ok().body(profileService.save(customer));
     }
}
