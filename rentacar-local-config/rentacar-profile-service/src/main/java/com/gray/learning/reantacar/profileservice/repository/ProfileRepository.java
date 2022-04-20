package com.gray.learning.reantacar.profileservice.repository;

import com.gray.learning.rentacar.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 20-Apr-22
 * Time: 7:45 PM
 * rentacar-profile-service
 */
@Repository
public interface ProfileRepository extends JpaRepository<Customer, Integer> {

}
