package com.yong.springcloud.entities;

import java.io.Serializable;

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
	private int authorincome;
	private String authorintroduction;
	private String authorworks;
	private Long authordots;
}
