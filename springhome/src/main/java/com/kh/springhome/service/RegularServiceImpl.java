package com.kh.springhome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.kh.springhome.dao.CertDao;

import lombok.extern.slf4j.Slf4j;

/*
 * 서비스(service)
 * - 복잡한 작업들을 하나로 묶어서 의미를 부여하기 위한 가장 큰 작업 단위
 * - 스케줄러 등을 이용해서 독립적으로 작업을 실행하기 위한 도구
 */

@Slf4j
@Service
public class RegularServiceImpl implements RegularService {
	
	@Autowired
	private CertDao certDao;

	//스케줄러 메소드는 언제 실행할 것인지에 대한 설정이 추가로 필요
	//와일드카드(*)는 해당되는 것 모두 다라는 뜻이다. 
	// * = all / ? = any
	
	//@Scheduled(fixedRate = 1000) //1000ms(1초)에 한 번씩
	//@Scheduled(cron = "* * * * * *")//예약식이 들어감 / 매초 매분 매시 매일 매월 매요일
	//@Scheduled(cron = "*/2 * * * * *")//매2초 매분 매시 매일 매월 매요일(2초마다)
	//@Scheduled(cron = "0 * * * * *")//0초 매분 매시 매일 매월 매요일(1분마다)
	@Scheduled(cron = "0 0 * * * *")//매 시 정각마다
	//@Scheduled(cron = "0 30 * * * *")//30분마다
	//@Scheduled(cron = "0 0 9 * * *")//매일아침 9시
	//@Scheduled(cron = "0 30 9,18 * * *")//출근할 때(9:30), 퇴근할 때(18:30) 한 번씩
	//@Scheduled(cron = "0 30 9-18 * * *")//출근할 때부터 퇴근할 때까지 1시간마다(9시반,10시반,...6시반)
	//@Scheduled(cron = "0 30 9-18 * * 1-5")//월~금까지 근무시간 1시간마다(숫자 1은 월요일)
	//@Scheduled(cron = "0 30 9-18 * * mon-fri")//바로 위코드 다른 버전
	//@Scheduled(cron = "* * * * * mon")//월요일만 1초마다
	//@Scheduled(cron = "* * * 18 * ?")//요일 무관 매 18일마다
	//@Scheduled(cron = "0 0 12 ? * 4L")//매월 마지막(L) 목요일(4) 12시 정각
	//@Scheduled(cron = "0 0 12 ? * thuL")//매월 마지막(L) 목요일(thu) 12시 정각(위 코드와 같음)
	//@Scheduled(cron = "0 0 12 ? * 4#1")//매월 1주차 목요일(4) 12시 정각
	//@Scheduled(cron = "0 0 12 ? * thu#1")//매월 1주차 목요일(thu) 12시 정각(위 코드와 같음)

	@Override
	public void clearCert() {
//		log.debug("실행되니?");
		certDao.deleteOver5min();
		
	}
	
}
