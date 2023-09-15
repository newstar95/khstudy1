package com.kh.springhome.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

//application.properties에 있는 custom.fileupload 설정을 저장할 파일
@Component //등록
@Data //private이라 접근 가능하게 세터게터
@ConfigurationProperties(prefix="custom.fileupload")
public class FileUploadProperties {
	private String home;

}
