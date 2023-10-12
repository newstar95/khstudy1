package com.kh.spring15.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder 
public class BookDto {
	private int bookId, bookPageCount;
	private float bookPrice;
	private String bookTitle, bookAuthor, bookPublicationDate, bookPublisher, bookGenre;
}
