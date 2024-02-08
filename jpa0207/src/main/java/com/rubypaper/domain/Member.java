package com.rubypaper.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Member {
  @Id
  @Column(name="MEMBER_ID")
  private  String  id;
  private  String  password;
  private  String  name;
  private  String  role;
  
}