package com.galaxy.computer.java.domain;

import lombok.*;

/**
 * @author Computer Galaxy
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseResponse {
    private String message;
    private Object obj;

    public BaseResponse producesResponse(String resp){
        BaseResponse baseResponse;
        if (resp.equals("Y")) {
            baseResponse = BaseResponse
                    .builder()
                    .message("SUCCESS")
                    .obj(resp)
                    .build();

        } else {
            baseResponse = BaseResponse
                    .builder()
                    .message("FAILED")
                    .obj(resp)
                    .build();
        }
        return baseResponse;
    }
}
