package com.kh.spring22.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder.Default;

@Schema(description = "도서 정보 객체")
@Data @NoArgsConstructor @AllArgsConstructor @Builder 
public class BookDto {
	private int bookId, bookPageCount;
	@Builder.Default
	private float bookPrice = -1f;
	private String bookTitle, bookAuthor, bookPublicationDate, bookPublisher, bookGenre;
}
