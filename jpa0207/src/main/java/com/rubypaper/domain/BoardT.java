package com.rubypaper.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="T0207")
public class BoardT {
	  @Id	
	  @GeneratedValue
	  private Long  seq;
	  private String  title;
	  private String  age;
}