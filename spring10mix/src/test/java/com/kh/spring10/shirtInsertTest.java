package com.kh.spring10;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring10.dao.ShirtDao;
import com.kh.spring10.dto.ShirtDto;

//Spring 테스트 공간
//- Spring에서는 개발 중인 도구들을 테스트 할 수 있도록 기능을 제공
//- JUit이라는 자바 테스팅 프레임워크를 가져다가 스프링화 시켜서 사용
//- spring-boot-starter-test라는 의존성에서 모두 제공(pom.xml)(추가 하지 않아도 스프링을 사용한다면 자동으로 생김)

@SpringBootTest //스프링에서 등록한 모든 도구를 가져다 쓸 수 있다. 이게 있어야 Autowired를 사용 가능
public class shirtInsertTest { //이름이 그냥 Test라고 지으면 안 된다.
	
	@Autowired 
	private ShirtDao dao;
	
	@Test //JUit을 이용하여 테스트를 할 코드를 작성하는 메소드
	public void test() {
		ShirtDto dto = new ShirtDto();
		dto.setShirtName("테스트 셔츠");
		dto.setShirtColor(("블랙"));
		dto.setShirtPrice(10000);
		dto.setShirtKind(("라운드"));
		dto.setShirtType(("민소매"));
		dto.setShirtMaterial(("폴리에스테르"));
		dto.setShirtStock(50);
		
		int shirtNo = dao.sequence();
		dto.setShirtNo(shirtNo);
		
		dao.insert(dto);
	}

}
