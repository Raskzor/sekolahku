package com.galaxy.computer.java.service.impl;

import com.galaxy.computer.java.domain.BaseResponse;
import com.galaxy.computer.java.domain.user.MstStatusUserType;
import com.galaxy.computer.java.domain.vo.ParameterVO;
import com.galaxy.computer.java.repository.MstStatusUserTypeRepository;
import com.galaxy.computer.java.service.ParameterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Computer Galaxy
 */
@Service("paremeterService")
@Slf4j
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    MstStatusUserTypeRepository mstStatusUserTypeRepository;

    @Override
    public BaseResponse addParameterUserType(ParameterVO parameterVO) {
        try{
            MstStatusUserType data = new MstStatusUserType(parameterVO);
            mstStatusUserTypeRepository.save(data);
        }catch (Exception e){
            log.error("ERROR addParameterUserType {}", e.getMessage());
        }
        return null;
    }
}
