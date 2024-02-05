package com.rubypaper.member;

import lombok.Data;

@Data
public class MemberVO {
	private int    custno;
	private String custname;
	private String password;
	private String phone;
	private String address;
	private String joindateStr;
	private String grade;
	private String city;
}