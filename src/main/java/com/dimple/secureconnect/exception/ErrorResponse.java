package com.dimple.secureconnect.exception;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

    private int status;
    private String message;
    LocalDateTime timeStamp;

    public ErrorResponse(int status,String message){
        this.status=status;
        this.message=message;
        this.timeStamp=LocalDateTime.now();
    }




}
