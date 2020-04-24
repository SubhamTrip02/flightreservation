package com.subham.flightreservation.respositories;

import com.subham.flightreservation.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user,Integer> {
    user findByEmail(String email);
}
