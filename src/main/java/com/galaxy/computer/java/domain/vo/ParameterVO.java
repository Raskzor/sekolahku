package com.galaxy.computer.java.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;


/**
 * @author Computer Galaxy
 */
@Getter
@Setter
@AllArgsConstructor
@Builder(toBuilder = true)
public class ParameterVO implements Serializable {
    @NotBlank
    private String userLogin;
    @NotBlank
    @Size(max = 1000)
    private String paramDesc;
    @NotBlank
    private int isActive;
}
