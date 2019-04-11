package com.yong.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class ReadUser implements Serializable{
	
	private Long userid;
	private String username;
	private String userpwd;
	
}
