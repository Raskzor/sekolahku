package com.galaxy.computer.java.service;

import com.galaxy.computer.java.domain.BaseResponse;
import com.galaxy.computer.java.domain.vo.UserLoginVO;
import com.galaxy.computer.java.domain.vo.UserRegisterVO;
import org.springframework.stereotype.Service;

/**
 * @author Computer Galaxy
 */
@Service
public interface UserService {
    public BaseResponse getUser(String username);

    BaseResponse userRegister(UserRegisterVO userRegisterVO);

    BaseResponse userLoginValidate(UserLoginVO userLoginVO);
}
