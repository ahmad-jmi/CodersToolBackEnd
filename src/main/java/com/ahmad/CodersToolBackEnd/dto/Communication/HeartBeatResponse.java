package com.ahmad.CodersToolBackEnd.dto.Communication;

public class HeartBeatResponse {
    private String message;

    public HeartBeatResponse(String message) {
        this.message = message;
    }

    public HeartBeatResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
