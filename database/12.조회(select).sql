/*
 	조회(SELECT)
 	- 테이블의 데이터를 원하는 목적에 맞게 선택적으로 조회
 	
 */

-- 샘플 테이블
create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
price number,
made date,
expire date
);

insert into product values(1, '스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '마이쮸', '사탕', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '초코파이', '과자', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '맛동산', '과자', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '참이슬', '주류', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, '처음처럼', '주류', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '바나나킥', '과자', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '빠삐코', '아이스크림', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '멘토스', '사탕', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '오레오', '과자', 2100, '2019-06-01', '2020-06-01');


select * from product;


-- 이름만 조회
select name from product;

-- 이름과 가격만 조회
select name, price from product;

--없는 항목은 조회할 수 없다

-- 항목을 계산해서 조회할 수 있다.
-- 날짜 계산 시 기본 처리 단위는 일이다.
select name, expire-made+1 from product;

-- 조회한 항목에 표시될 이름을 지정할 수 있다. (별칭 설정) 
-- 별칭에 띄어쓰기가 있는 경우는 쌍다옴표로 감싸서 처리한다.
select name "이름", expire-made+1 "유통기한" from product;

------------------------------------------------------------------
-- 조건(where)
------------------------------------------------------------------
select * from product where price >= 2000; --가격이 2000원 이상인 것만

-- 1000원 이상 2000원 이하인 상품 정보 조회
select * from product where price >= 1000 and price <= 2000;
select * from product where price between 1000 and 2000;

-- 오라클에서는 같다가 = 로 표현된다.
select * from product where price = 1000;

select * from product where price != 1000;
select * from product where price <> 1000;

-- <문자열 조건>
-- 문자열도 같음을 = 로 처리한다.
-- 유사검색은 like와 instr()로 처리할 수 있다.

-- 똑같이 나오지만 동작하는 원리가 다르다.
-- 	시작 검색만큼은 반드시 like를 써야할 정도로 압도적인 차이가 발생
-- 나머지 성능은 전체적으로 instr이 우수하다.
-- 복잡한 검색은 like로 가능하다.
select * from product;
select * from product where name = '스크류바';

-- 스크로 시작되는 상품 정보 조회
select * from product where name like '스크%'; --앞 글자만 봐도 판정이 된다.
select * from product where instr(name, '스크') = 1;

-- instr()은 위치를 찾는 명령이다. 있으면 1 없으면 0이 나온다.
-- 오라클은 인덱스가 1부터 시작한다.

select * from product where name like '%이%'; --이라는 글자가 나오는지 찾는다, 이런식으로 쓰면 스킵이 안 된다.

select * from product where name like '오%오'; --복잡한 검색

--퍼센트가 앞에 들어가면 instr()이랑 차이가 없다. 전체를 다 봐야 하는 상황은 instr()이 빠르고 일부분을 봐야하는 like가 빠르다.
-- 시작키워드 검사만 like를 쓰고 나머지는 전부 instr()을 쓴다.


-- (Q) 과자와 아이스크림만 조회
select * from product where type = '과자' or type = '아이스크림';
select * from product where type in ('과자', '아이스크림'); -- O
-- (Q) 이름에 '초코'가 들어간 상품 정보 조회(instr이 좋음)
select * from product where name like '%초코%';
select * from product where instr(name, '초코') > 0; -- O
-- (Q) 이름이 '바나나'로 시작하는 상품 정보 조회(like가 좋음)
select * from product where name like '바나나%';  -- O
select * from product where instr(name, '바나나') = 1;
-- (Q) 이름에 '이'가 들어있지 않은 상품 정보 조회
select * from product where name not like '%이%';
select * from product where instr(name, '이') = 0; -- O
-- (Q) 가격이 1000원 이상인 과자 조회
select * from product where price >= 1000;

-- <날짜 조건>
-- 기본 형식은 yyyy-mm-dd hh24:mi:ss 이다.
-- 문자열로 간주하고 조회할 수 있다. (운영체제에 따라 작동여부 결정)
-- 문자열로 변환하고 싶다면 to_char() 사용
-- 날짜 추출용 함수인 extract()를 사용하여 원하는 항목 추출

-- 2020년에 제조된 상품 조회
-- select * from product where made like '2020%'; 안되는 코드
select * from product where to_char(made, 'yyyy') = '2020';
select * from product where extract(year from made) = 2020; --made라는 곳에서 연도를 뽑겠다.
select * from product where 
	made between 
	to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss')
	and 
	to_date('2020-12-31 23:59:59', 'yyyy-mm-dd hh24:mi:ss');

-- (Q) 여름(6, 7, 8)월에 생산한 상품 정보 조회
select * from product where to_char(made, 'mm') in ('06', '07'.'08'); --문자열을 사용해서 풀기
select * from product where extract(month from made) between 6 and 8;
select * from product where extract(month from made) = 06 or extract(month from made) = 07 or
extract(month from made) = 08;

-- (Q) 2019년 하반기에 생산한 상품 정보 조회
-- 하반기 (07/01~12/31)
select * from product where to_char(made, 'yyyy-mm') 
in ('2019-07', '2019-08', '2019-09', '2019-10', '2019-11', '2019-12');
select * from product where extract(year from made) = 2019 and extract(month from made) between 7 and 12;
select * from product where made between to_date('2019-07-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') and
to_date('2019-12-31 23:59:59' , 'yyyy-mm-dd hh24:mi:ss');

-- (Q) 2020년부터 현재까지 생산한 상품 정보 조회
select * from product where made between to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') and sysdate;

-- (Q) 최근 1년간 생산한 상품 정보 조회
-- 오라클 날짜는 기본 계산 단위가 (일)이다.
-- 따라서 1년전은 sysdate - 365이다.
select * from product where made between sysdate-365 and sysdate;

-- (응용) 시간까지 고려(시작일 00시부터 종료일 23시59분까지)
select * from product 
	where made between 
	to_date(
		to_char(sysdate-365, 'yyyy-mm-dd') || ' ' || '00:00:00',
		'yyyy-mm-dd hh24:mi:ss'
	)
	and 
	to_date(
		to_char(sysdate, 'yyyy-mm-dd') || ' ' || '23:59:59', 
		'yyyy-mm-dd hh24:mi:ss'
	);

------------------------------------------------------------------
-- 정렬(Order)
------------------------------------------------------------------
-- 모든 조회가 끝나고 나온 결과를 원하는 목적에 따라 재배열 (조건보다 앞에 나오면 안 됨, 데이터가 확정이 되고난 후)
-- 정렬을 따로 지정하지 않겠다(비추천)
-- ase(오름차순, ascending), desc(내림차순, ) 안 쓰면 오름차순

select * from product; 

select * from product order by no;
select * from product order by no asc;
select * from product order by no desc;

-- 2차 정렬
select * from product order by price desc, no asc;

-- (Q) 최근에 제조된 상품부터 출력
select * from product order by made desc;

-- 번호가 시퀀스라면 아래 코드도 가능
-- select * from product order by no desc;
-- (Q) 폐기일이 오래된 상품부터 출력
select * from product order by expire asc;

-- (Q) 이름순으로 출력
select * from product order by name asc;
select * from product order by name asc, no asc;

-- (Q) 상품을 종류별로 가격이 비싼 순으로 출력
select * from product order by type asc, price desc, no asc;

-- (Q) 유통기한이 가장 짧은 상품부터 출력(expire - made + 1) 오늘 만들어서 오늘 폐기해야하면 유통기한이 1이기 때문에 +1
select * from product order by expire-made+1 asc, no asc;

-- 부여한 별칭으로 정렬 가능
select 
	no, name, type, price, made, expire, expire-made+1 유통기한 
	from product 
	order by 유통기한 asc, no asc;

-- *(와일드카드)는 다른 항목과 같이 쓸 수 없고 테이블에 .*를 추가하여 사용
select 
	product.*, expire-made+1 유통기한
from product
order by 유통기한 asc, no asc;

-- 테이블에도 별칭 부여가 가능하다.
select 
	p.*, expire-made+1 유통기한
from product p
order by 유통기한 asc, no asc;
