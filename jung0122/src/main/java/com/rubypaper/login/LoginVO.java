package com.rubypaper.login;

import lombok.Data;

@Data
public class LoginVO {
    private String idx;
    //id는 user로 변경 필요
    private String username;  //필수(이름 고정)
    private String password;  //필수(이름 고정)
    private String role;
    private String name;
    private String grade;
    
    private String SessionID;
}