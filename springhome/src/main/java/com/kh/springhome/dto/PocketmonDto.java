package com.kh.springhome.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data //@Setter + @Getter + @ToString + @EqualsAndHashCode / 밑 코드를 줄인 것, 생성자는 불포함
//@Setter @Getter @NoArgsConstructor @ToString
//세터 메소드를 만들고 싶다면 필드 위에 세터라고 쓰면 된다. 게터도 마찬가지
//생성자는 NoArgsConstructor, AllArgsConstructor 
public class PocketmonDto {
	private int no;
	private String name;
	private String type;
}
