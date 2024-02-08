package com.rubypaper.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Board {
	@Id @GeneratedValue
	private Long seq;
	private String title;
	private String content;
	private Date createDate;
	private Long cnt;
}