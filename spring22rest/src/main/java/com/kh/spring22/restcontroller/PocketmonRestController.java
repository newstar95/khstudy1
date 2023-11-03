package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.dao.PocketmonDao;
import com.kh.spring22.dto.PocketmonDto;

@CrossOrigin
//@CrossOrigin(value= {"http://localhost:3000", "http://localhost:5500"})
@RestController
@RequestMapping("/pocketmon")
public class PocketmonRestController {
	// 아래 다섯 개의 매핑을 이용하여 프론트엔드에 대응하는 Rest 기능을 구현
	//	@GetMapping - 조회 (post로 하는 경우도 있다.)
	//	@PostMapping- - 등록
	//	@PutMapping - 전체 수정
	//	@PatchMapping - 일부 수정
	//	@DeleteMapping - 삭제
	
	@Autowired
	private PocketmonDao pocketmonDao;
	
	@GetMapping("/")
	public List<PocketmonDto> list() {
		return pocketmonDao.selectList();
	}
	
	@PostMapping("/")
//	public void insert(@ModelAttribute PocketmonDto pocketmonDto) { //form-data 수신용
	public void insert(@RequestBody PocketmonDto pocketmonDto) { //request body 직접 해석(ex:), spring 거를 import
		pocketmonDao.insert(pocketmonDto);
	}
	
	//파라미터는 주소가 매우 지저분해지므로 최대한 경로변수를 활용
	@DeleteMapping("/{no}")
//	public boolean delete(@PathVariable int no) { //데이터를 반환하면 상태설정이 불가능(우리는 상태설정이 필요)
	public ResponseEntity<String> delete(@PathVariable int no) { //상태 설정이 가능한 객체를 반환( 데이터<응답객체> )
		boolean result = pocketmonDao.delete(no);
		if(result) {
//			return ResponseEntity.ok().build(); //메세지
			return ResponseEntity.status(200).build(); //숫자
			}
		else {
//			return ResponseEntity.notFound().build(); //메세지
			return ResponseEntity.notFound().build(); //숫자
		}
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<PocketmonDto> find(@PathVariable int no) {
		PocketmonDto pocketmonDto = pocketmonDao.selectOne(no);
		
		if(pocketmonDto != null) {
			return ResponseEntity.ok(pocketmonDto);
		}
		else {
			return ResponseEntity.notFound().build(); 
		}
	}
	
	@PutMapping("/{no}") //원래 번호
	//ResponseEntity에는 꼭 String을 적어야하는 것이 아니고 주고 싶은 형태로 써도 됨, 없으면 Void를 쓰기도 함
	public ResponseEntity<String> edit(
				@PathVariable int no, @RequestBody PocketmonDto pocketmonDto) { 
		boolean result = pocketmonDao.edit(no, pocketmonDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
	}
}
