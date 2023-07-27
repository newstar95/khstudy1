package com.kh.spring05.dto;

//POJO 클래스
//= Plain Old Java Object
// Spring에 등록하지 않아도 됨
// 스프링에 부탁하지 않아도 상관 없는 옛날 방식같은 클래스
public class PocketmonDto {
	private int no;
	private String name;
	private String type;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public PocketmonDto() {
		super();
	}
	
	@Override
	public String toString() {
		return "PocketmonDto [no=" + no + ", name=" + name + ", type=" + type + "]";
	}

}
