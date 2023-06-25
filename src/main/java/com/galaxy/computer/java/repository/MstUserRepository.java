package com.galaxy.computer.java.repository;

import com.galaxy.computer.java.domain.user.MstUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


/**
 * @author Computer Galaxy
 */
@Repository
public interface MstUserRepository extends JpaRepository<MstUser, Integer>{
    MstUser findByUsername(String username);
    MstUser findPasswordByUsername(String username);

    @Query(value = "select password from mst_user mu where mu.username = ?1",
            nativeQuery = true)
    String getPasswordByUsername(String username);
}
