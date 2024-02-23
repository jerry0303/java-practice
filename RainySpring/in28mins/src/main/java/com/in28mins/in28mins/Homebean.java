package com.in28mins.in28mins;

public class Homebean {
    private String message;
    public Homebean(String message) {
        this.message=message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return String.format("Homebean [message=%s]",message);
    }
}
