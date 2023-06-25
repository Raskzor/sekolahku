package com.galaxy.computer.java.service.impl;

import com.galaxy.computer.java.domain.user.MstUser;
import com.galaxy.computer.java.domain.vo.UserLoginVO;
import com.galaxy.computer.java.repository.MstUserRepository;
import com.galaxy.computer.java.service.PasswordService;
import com.galaxy.computer.java.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

/**
 * @author Computer Galaxy
 */
@Service("passwordService")
public class PasswordServiceImpl implements PasswordService {

    @Autowired
    private MstUserRepository mstUserRepository;

    @Override
    public String hashPassword(String oriPassword) {
        return BCrypt.hashpw(oriPassword, BCrypt.gensalt(12));
    }

    @Override
    public boolean validatePassword(UserLoginVO userLoginVO) {
        return BCrypt.checkpw(userLoginVO.getPassword(), getHashPasswordByUsername(userLoginVO.getUsername()));
    }

    @Override
    public boolean validateUser(UserLoginVO userLoginVO) {
        String data =  mstUserRepository.getPasswordByUsername(userLoginVO.getUsername());
        return !CommonUtil.isEmptyOrNull(data) && validatePassword(userLoginVO);
    }

    private String getHashPasswordByUsername(String username) {
        String data =  mstUserRepository.getPasswordByUsername(username);
        return CommonUtil.isEmptyOrNull(data) ? "" : data;
    }


}
