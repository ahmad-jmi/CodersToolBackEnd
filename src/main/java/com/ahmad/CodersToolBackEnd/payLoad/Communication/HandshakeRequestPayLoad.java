package com.ahmad.CodersToolBackEnd.payLoad.Communication;

public class HandshakeRequestPayLoad {
    private String message;

    public HandshakeRequestPayLoad(String message) {
        this.message = message;
    }

    public HandshakeRequestPayLoad() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
