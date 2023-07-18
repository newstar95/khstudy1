-- 데이터 저장
-- 테이블에 데이터를 저장하는 구문을 작성
-- (주의)문자열은 외따옴표 사용 (쌍따옴표는 별칭을 붙일 때 사용)
-- INSERT INTO 테이블이름(항목) VALUES(값);
-- 포켓몬스터라는 테이블에 내가 이름, 번호, 속성을 넣을 건데 1번 이상해씨 풀... 이런 식이다

INSERT INTO POCKETMON(NO, NAME, TYPE) 
VALUES(1, '이상해씨', '풀'); 

-- 조회 명령
SELECT * FROM POCKETMON;

INSERT INTO POCKETMON(NO, NAME, TYPE) 
VALUES(2,'이상해풀','풀');

INSERT INTO POCKETMON(NO, NAME, TYPE)
VALUES(3,'이상해꽃','풀');

INSERT INTO POCKETMON(NO, NAME, TYPE)
VALUES(4,'파이리','불꽃');

INSERT INTO POCKETMON(NO, NAME, TYPE)
VALUES(7,'꼬부기','물');
