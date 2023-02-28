package com.example.demo.response;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class BaseResponse {

    protected boolean success;
    protected String message;

}
