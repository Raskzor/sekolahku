package com.galaxy.computer.java.controller;

import com.galaxy.computer.java.domain.BaseResponse;
import com.galaxy.computer.java.domain.vo.ParameterVO;
import com.galaxy.computer.java.service.ParameterService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Computer Galaxy
 */
@RestController
@RequestMapping(value = "/v1/param")
public class ParameterController {

    @Autowired
    ParameterService parameterService;

    @Operation(summary = "Register New User")
    @PostMapping("/user/type")
    public ResponseEntity<BaseResponse> postAddParameterUserType(@RequestBody ParameterVO parameterVO){
        BaseResponse resp = parameterService.addParameterUserType(parameterVO);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

}
