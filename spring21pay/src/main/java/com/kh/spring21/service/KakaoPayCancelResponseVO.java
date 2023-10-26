package com.kh.spring21.service;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.kh.spring21.vo.KakaoPayAmountVO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class KakaoPayCancelResponseVO {
	private String aid, cid, tid, status, partnerOrderId, partnerUserId, paymentMethodType;
	private KakaoPayAmountVO amount;
	private KakaoPayAmountVO approvedCancelAmount, canceledAmount, cancelAvailableAmount;
	private String itemName, itemCode, payload;
	private int quantity;
	private Date createdAt, approvedAt, canceledAt;

}
