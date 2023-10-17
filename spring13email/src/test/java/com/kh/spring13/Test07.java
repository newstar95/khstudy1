package com.kh.spring13;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.FilteredClassLoader.ClassPathResourceFilter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test07 {
	
	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() throws MessagingException {
		//목표 : 이메일 첨부파일 넣고 전송하기
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8"); //멀티파트 사용 true
		
		helper.setTo(new String[] {"wkdtoquf3@naver.com"});
		helper.setSubject("첨부파일 테스트");
		helper.setText("첨부파일을 확인해주세요!");
		
		//첨부파일을 찾아서 메일에 추가
		ClassPathResource resource = new ClassPathResource("static/images/honeybee.png");
//		helper.addAttachment("꿀벌", resource);
		helper.addAttachment(resource.getFilename(), resource);
		
		sender.send(message);
	}
}
