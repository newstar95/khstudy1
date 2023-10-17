package com.kh.spring18.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.mail.MailException;

public interface EmailService {
	void sendCelebration(String email) throws MessagingException, MailException, FileNotFoundException, IOException;
}
