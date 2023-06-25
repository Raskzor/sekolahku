package com.galaxy.computer.java.service;

import com.galaxy.computer.java.domain.vo.UserLoginVO;
import org.springframework.stereotype.Service;

/**
 * @author Computer Galaxy
 */
@Service
public interface PasswordService {
    public String hashPassword(String oriPassword);

    boolean validatePassword(UserLoginVO userLoginVO);

    boolean validateUser(UserLoginVO userLoginVO);
}
