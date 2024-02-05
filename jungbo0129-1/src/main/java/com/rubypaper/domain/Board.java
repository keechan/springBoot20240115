package com.rubypaper.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
//Entity와 테이블명(T0205)을 다르게 지정함
@Table(name="T0205")
public class Board {
	//Id로 PK지정해야 함 - Entity ..
	//JPA제공 Method 가 Long 형태임
	@Id  @GeneratedValue
	private Long seq;
	private String title;
	private String age;
	//update 사용불가
	@Column(updatable=false)
	private String writer;
	private String content;
	//insert, update 사용불가, Default값 지정
	@Column(insertable=false, updatable=false, columnDefinition="date default sysdate")
	private Date createDate;
	@Column(insertable=false, columnDefinition="number default 0")
	private Long cnt;
}