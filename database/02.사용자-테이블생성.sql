-- 예제: 포켓몬 정보
CREATE TABLE pocketmon(
no number(4),
name varchar2(21),
type varchar2(9)
);

-- 문제1: 월드컵 선수 정보
CREATE TABLE WORLDCUP(
RANK NUMBER,
NAME VARCHAR2(30),
NATION VARCHAR2(15),
GOAL NUMBER
);

-- 문제2: 메달리스트 정보
CREATE TABLE MEDALIST(
NAME VARCHAR2(21),
EVENT VARCHAR2(12),
TYPE VARCHAR2(30),
GOLD NUMBER,
SILVER NUMBER,
BRONZE NUMBER
);

-- 문제3: 통신사 요금제 정보
-- 통신사가 무조건 2자리라면 고정문자열 처리
-- (장점) 빠른 처리 속도
-- (단점) 글자 수가 다를 수 없음
CREATE TABLE PLAN(
TELECOM CHAR(2),
NAME VARCHAR2(40), --최대로 주면 4000byte
MONTH_PRICE NUMBER, --38자리
DATA NUMBER,
CALL NUMBER,
SMS NUMBER
);

-- 메뉴 정보 테이블
-- (참고) 테이블 자료형에는 논리가 없다.
-- Y/N으로 처리하거나 1/0으로 처리

CREATE TABLE menu(
name varchar2(60), --한글 기준 20글자
TYPE varchar2(9),
price number,
event char(1),
);
