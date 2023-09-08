package com.kh.spring11.rest;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring11.dao.MemberDao;
import com.kh.spring11.dto.MemberDto;

//CORS를 해제하기 위한 설정(Annotation)
//@CrossOrigin //전부다 허용(위험!)
@CrossOrigin(origins = {"http://127.0.0.1:5501"}) //vscode 홈페이지 주소
@RestController //@Controller + @responseBody 
public class DummyRestController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello spring ajax";
	}
	
	//Rest Controller에서는 내가 전해줄 데이터가 반환형이 된다.
	//- 자동으로 Spring에서 JSON형태로 변환하여 반환
	//- 변환을 담당하는 라이브러리 jackson-databind
	@RequestMapping("/lotto")
	public Set<Integer> lotto() {
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();
		while(set.size() < 6) {
			int n = r.nextInt(45) + 1;
			set.add(n);
		}
		return set;
	}
	
	@Autowired
	private MemberDao memberDao;
	
	@PostMapping("/idCheck")
	public String idCheck(@RequestParam String memberId) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		if(memberDto != null) { //아이디가 있으면
			return "Y";
		}
		else { //아이디가 없으면
			return "N";
		}
	}
	
	@PostMapping("/nicknameCheck")
	public String nicknameCheck(@RequestParam String memberNickname) {
		MemberDto memberDto = 
				memberDao.selectOneByMemberNickname(memberNickname);
		if(memberDto == null) {
			return "Y";
		}
		else {
			return "N";
		}
	}
}
