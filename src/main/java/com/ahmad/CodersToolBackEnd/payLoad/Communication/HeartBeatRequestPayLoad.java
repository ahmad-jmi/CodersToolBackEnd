package com.ahmad.CodersToolBackEnd.payLoad.Communication;

public class HeartBeatRequestPayLoad {
    private String message;

    public HeartBeatRequestPayLoad(String message) {
        this.message = message;
    }

    public HeartBeatRequestPayLoad() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
