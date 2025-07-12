package com.ahmad.CodersToolBackEnd.dto.Communication;


import org.springframework.stereotype.Component;

@Component
public class HandshakeResponse {
    boolean accepted;
    String status;

    public HandshakeResponse(boolean accepted, String status) {
        this.accepted = accepted;
        this.status = status;
    }

    public HandshakeResponse() {
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
