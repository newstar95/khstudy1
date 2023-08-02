package com.kh.spring10.dto;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.Data;

@Data
public class BookDto {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublicationDate;
	private float bookPrice;
	private String bookPublisher;
	private int bookPageCount;
	private String bookGenre;

}
