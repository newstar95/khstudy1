package com.kh.springhome.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDto {
	private int boardNo;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private int boardReadcount;
	private int boardLikecount;
	private int boardReplycount;
	private Date boardCtime;
	private Date boardUtime;
}