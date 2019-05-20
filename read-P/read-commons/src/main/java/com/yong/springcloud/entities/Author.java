package com.yong.springcloud.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Author implements Serializable{
	
	private Long authorid;
	private String authorname;
	private String authoremail;
	private String authorsex;
	private BigDecimal authorincome;
	private String authorintroduction;
	private String authorworks;
	private Long authordots;
}
