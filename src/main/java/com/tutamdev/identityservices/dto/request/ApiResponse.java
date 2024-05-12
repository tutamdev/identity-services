package com.tutamdev.identityservices.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;


// Null does not send back
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse <T>{
    //default code 1000: successful
    private int code = 1000;
    private String message;
    private T result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
