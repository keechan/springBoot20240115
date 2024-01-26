package com.rubypaper.member;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MemberVO {
  private String idx;
  private String username;
  private String password;
  private String role;
  private String name;
  private String grade;
  private String files;
  private MultipartFile file;
}