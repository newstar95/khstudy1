package com.kh.spring10.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor //<- 기본 생성자
public class ShirtDto {
	private int shirtNo;
	private String shirtName;
	private String shirtColor;
	private int shirtPrice;
	private String shirtKind;
	private String shirtType;
	private String shirtMaterial;
	private int shirtStock;
}
