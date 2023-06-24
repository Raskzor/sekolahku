package com.galaxy.computer.java.repository;

import com.galaxy.computer.java.domain.MstUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Computer Galaxy
 */
@Repository
public interface MstUserRepository extends JpaRepository<MstUser, Integer>{
    MstUser findByUsername(String username);
    String findPasswordByUsername(String username);
}
