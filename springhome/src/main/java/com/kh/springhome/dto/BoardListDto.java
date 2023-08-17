package com.kh.springhome.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Data;

//오로지 게시판 목록을 위한 DTO
@Data
public class BoardListDto {
	private String memberNickname;
	private int boardNo;
	private int boardReadcount, boardLikecount, boardReplycount;
	private String boardWriter, boardTitle;
	private Date boardCtime, boardUtime;
	
	//작성자 출력용 메소드
	public String getBoardWriterString() {
		if(boardWriter == null) 
				return "(탈퇴한사용자)";
			return boardWriter;
	}
	
	//날짜에 따라 다른 값을 반환하는 메소드
	public String getBoardCtimeString() {
		LocalDate current = LocalDate.now(); //현재날짜
		LocalDate ctime = boardCtime.toLocalDate(); //작성일
		
		if(ctime.isEqual(current)) { //작성일이 오늘이면 / 작성일 == 오늘
			Timestamp stamp = new Timestamp(boardCtime.getTime());
			LocalDateTime time = stamp.toLocalDateTime();
			LocalTime result = time.toLocalTime();
			return result.toString(); //시간
		}
		else {
			return ctime.toString(); //날짜
		}
	}

}
