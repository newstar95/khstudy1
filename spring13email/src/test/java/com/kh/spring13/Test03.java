package com.kh.spring13;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.kh.spring13.configuration.EmailProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j //로그 쓰고 싶을 때
@SpringBootTest
public class Test03 {
	
	//application.properties에 작성된 정보를 불러와 사용
	@Autowired
	private JavaMailSender sender;
	
	@Test 
	public void test() {
		//전송 메세지 - 상대방의 정보와 메일 내용을 설정
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("wkdtoquf3@naver.com"); //받는사람
		message.setSubject("야"); //제목
		message.setText("호"); //내용
		
		//전송
		sender.send(message);
	}
}
