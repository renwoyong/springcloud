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
	private String useremail;
	private String usersex;
	private Long readcount;
	private Long readpay;
	private String state;
	private String vipset;
	private String starttime;
	private String endtime;
	
}
