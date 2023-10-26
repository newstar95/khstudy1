package com.kh.spring21.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProductDto {
	private int productNo;
	private String productName;
	private int productPrice;
}