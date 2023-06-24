package com.galaxy.computer.java.domain.vo;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Computer Galaxy
 */
@Getter
public class UserLoginVO implements Serializable {

    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
