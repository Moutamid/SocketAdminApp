package com.moutamid.socketadminapp;
public class UserEmail {
    private String email;
    private String status;

    public UserEmail() {
    }

    public UserEmail(String email, String status) {
        this.email = email;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
