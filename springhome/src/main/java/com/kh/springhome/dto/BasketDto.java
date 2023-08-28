package com.kh.springhome.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BasketDto {
	private int basketNo, basketItem, basketQty;
	private String basketUser;
	private Date basketTime;
}
