package com.yong.springcloud.entities;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Chapter implements Serializable{

	private Long chapterid;
	private Long bookid;
	private String chaptername;
	private String chaptercontent;
	private int chaptercount;
	private Date ctime;
	private String state;
	private String free;
}
