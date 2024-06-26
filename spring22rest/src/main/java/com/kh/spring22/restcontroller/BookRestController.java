package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.dao.BookDao;
import com.kh.spring22.dto.BookDto;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "도서 관리", description = "도서 정보 관리를 위한 컨트롤러")
@CrossOrigin
@RestController
@RequestMapping("/book") //주소는 반드시 테이블명(테이블명을 노출시키고 싶지 않다면 그와 비슷한 유사 이름)
public class BookRestController {

	@Autowired
	private BookDao bookDao;
	
	@GetMapping("/") //자원 설계 방식이 기능이 아니라서 주소 이름이 list가 아님
	public List<BookDto> list(){
		return bookDao.selectList();
	}
	
	@GetMapping("/bookId/{bookId}")
	public BookDto find(@PathVariable int bookId) {
		return bookDao.selectOne(bookId);
	}
	
	@GetMapping("/bookTitle/{bookTitle}")
	public List<BookDto> search(@PathVariable String bookTitle) {
		return bookDao.searchList(bookTitle);
	}
	
	@PostMapping("/")
	public void insert(@RequestBody BookDto bookDto) {
		bookDao.insert(bookDto);
	}
	
	@PutMapping("/{bookId}")
	public void update(@RequestBody BookDto bookDto, @PathVariable int bookId) {
		//bookDto에 모든 항목이 있는지 검사해야함
		bookDao.edit(bookId, bookDto);
	}
	@PatchMapping("/{bookId}")
	public void update2(@RequestBody BookDto bookDto, @PathVariable int bookId) {
		//bookDto에 항목이 하나라도 있는지 검사해야함
		bookDao.edit(bookId, bookDto);
	}
	@DeleteMapping("/{bookId}")
	public void delete(@PathVariable int bookId) {
		bookDao.delete(bookId);
	}
	
	//프론트엔드에서 페이지번호, 데이터 개수를 보낼 경우의 조회 매핑
	@GetMapping("/page/{page}/size/{size}")
	public List<BookDto> listByPage(@PathVariable int page, @PathVariable int size) {
		return bookDao.selectListByPage(page, size);
	}
	
}
