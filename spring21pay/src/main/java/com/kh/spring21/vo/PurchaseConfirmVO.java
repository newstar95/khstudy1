package com.kh.spring21.vo;

import com.kh.spring21.dto.ProductDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PurchaseConfirmVO {
	private PurchaseVO purchaseVO;
	private ProductDto productDto;
	public int getTotal() {
		return purchaseVO.getQty() * productDto.getProductPrice();
	}
}
