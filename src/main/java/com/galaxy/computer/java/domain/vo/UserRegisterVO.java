package com.galaxy.computer.java.domain.vo;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Computer Galaxy
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserRegisterVO {

    @NotBlank
    private String userName;
    @NotBlank
    private String firstName;
    private String lastName;
    @NotBlank
    private String email;
    @NotBlank
    @Size(min = 10, max = 20)
    private String noPhone;
    @NotBlank
    @Size(min = 8)
    private String password;

    @NotBlank
    private String userLogin;
}
