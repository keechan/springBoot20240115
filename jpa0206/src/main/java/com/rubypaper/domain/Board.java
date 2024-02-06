package com.rubypaper.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Entity
@Table(name="T0205")
public class Board {
	//Id로 PK지정해야 함 - Entity...
	//JPA제공 Method 가 Long 형태임
	@Id @GeneratedValue
	private Long seq;
	@Column(length=20)
	private String title;
	@Column(precision=3, scale=2)
	private int age;
	@Column(nullable=true)
	private String writer;
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	@Column(insertable=true, columnDefinition="date default sysdate")
	private Date create_Date;
	@Column(insertable=true, columnDefinition="number default 1")
	private Long cnt;
	@Column(precision=12, scale=2,
			columnDefinition = "decimal(12, 2) default 0.00")
	private BigDecimal pay;
	@Transient
	private String ch1;
	@Transient
	private String ch2;
}
