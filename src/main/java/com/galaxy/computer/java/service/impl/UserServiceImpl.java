package com.galaxy.computer.java.service.impl;

import com.galaxy.computer.java.domain.BaseResponse;
import com.galaxy.computer.java.domain.MstUser;
import com.galaxy.computer.java.domain.vo.UserLoginVO;
import com.galaxy.computer.java.domain.vo.UserRegisterVO;
import com.galaxy.computer.java.repository.MstUserRepository;
import com.galaxy.computer.java.service.PasswordService;
import com.galaxy.computer.java.service.UserService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author Computer Galaxy
 */
@SuppressWarnings("unused")
@Service("userService")
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private MstUserRepository mstUserRepository;
    @Autowired
    private PasswordService passwordService;

    @Override
    public BaseResponse getUser(String username) {
        try {
            if (!username.isEmpty()) {
                BaseResponse resp;
                MstUser data = mstUserRepository.findByUsername(username);
                if (Objects.nonNull(data)) {
                    resp = BaseResponse.builder()
                            .message("Success")
                            .obj(data)
                            .build();
                } else {
                    resp = BaseResponse.builder()
                            .message("Success")
                            .obj(new MstUser())
                            .build();
                }
                return resp;
            } else {
                return null;
            }
        } catch (Exception e) {
            log.error("ERROR : {}", e.getMessage());
            return null;
        }

    }

    @Override
    public BaseResponse userRegister(UserRegisterVO userRegisterVO) {
        BaseResponse resp = null;
        try{
            UserRegisterVO vo = userRegisterVO.toBuilder()
                    .password(passwordService.hashPassword(userRegisterVO.getPassword()))
                    .build();
            MstUser data = new MstUser(vo);
            mstUserRepository.save(data);
            resp = BaseResponse.builder()
                    .message("Success")
                    .obj(null)
                    .build();
        }catch (Exception e){
            log.error("ERROR userRegister : {}", e.getMessage());
        }
        return resp;
    }

    @Override
    public BaseResponse userLoginValidate(UserLoginVO userLoginVO) {
        boolean resp = passwordService.validatePassword(userLoginVO);
        return null;
    }
}
