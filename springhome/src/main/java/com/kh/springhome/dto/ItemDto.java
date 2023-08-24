package com.kh.springhome.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ItemDto {
	private int itemNo, itemPrice;
	private String itemName;
	private Date itemRegist;
}
