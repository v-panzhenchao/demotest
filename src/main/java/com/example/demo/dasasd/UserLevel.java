package com.example.demo.dasasd;



public enum UserLevel {

    primary(1,"初级用户"),
    advanced(2,"高级用户");

    private int code;
    private String massage;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    UserLevel(int code, String massage) {
        this.code = code;
        this.massage = massage;
    }
}
