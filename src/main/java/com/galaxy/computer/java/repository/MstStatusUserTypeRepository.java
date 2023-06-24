package com.galaxy.computer.java.repository;

import com.galaxy.computer.java.domain.user.MstStatusUserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Computer Galaxy
 */
@Repository
public interface MstStatusUserTypeRepository extends JpaRepository<MstStatusUserType, Integer> {

}
