package com.galaxy.computer.java.service;

import com.galaxy.computer.java.domain.BaseResponse;
import com.galaxy.computer.java.domain.vo.ParameterVO;
import org.springframework.stereotype.Service;

/**
 * @author Computer Galaxy
 */
@Service
public interface ParameterService {
    BaseResponse addParameterUserType(ParameterVO parameterVO);
}
