package com.yong.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class AdminUser implements Serializable{
	
	private Long auserid;
	private String ausername;
	private String auserpwd;

}
