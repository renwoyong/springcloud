package com.yong.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Comment implements Serializable{
	
	private Long commentid;
	private String username;
	private Long bookid;
	private String bookname;
	private String context;
	private String createdtime;

}
