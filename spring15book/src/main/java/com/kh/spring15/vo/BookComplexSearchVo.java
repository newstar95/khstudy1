package com.kh.spring15.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BookComplexSearchVo {
	private Integer bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublisher;
	private Integer bookPriceMin, bookPriceMax;
	private String bookPublicationBegin, bookPublicationEnd;
	private Integer bookPageCountMin, bookPageCountMax;
	private List<String> bookGenreList;
	private List<String> orderList;
	private Integer begin;
	private Integer end;
}
