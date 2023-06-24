package com.galaxy.computer.java.controller;

import com.galaxy.computer.java.domain.BaseResponse;
import com.galaxy.computer.java.domain.vo.UserLoginVO;
import com.galaxy.computer.java.domain.vo.UserRegisterVO;
import com.galaxy.computer.java.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Computer Galaxy
 */
@RestController
@RequestMapping(value = "/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Get User by Username")
    @GetMapping("/data")
    public ResponseEntity<BaseResponse> getUserbyUsername(@RequestParam(value = "username", required = true) String username) {
        BaseResponse resp = userService.getUser(username);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @Operation(summary = "Register New User")
    @PostMapping("/register")
    public ResponseEntity<BaseResponse> postRegisterUser(@RequestBody UserRegisterVO userRegisterVO){
        BaseResponse resp = userService.userRegister(userRegisterVO);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @Operation(summary = "Login User")
    @PostMapping("/login")
    public ResponseEntity<BaseResponse> userLogin(@RequestBody UserLoginVO userLoginVO){
        BaseResponse resp = userService.userLoginValidate(userLoginVO);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }
}
