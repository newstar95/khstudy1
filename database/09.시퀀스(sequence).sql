/*
 	시퀀스(sequence)
 	- 번호를 발행해주는 기계(도구/객체)
    - 데이터베이스 종류에 따라 시퀀스가 테이블과 합쳐져 있는 경우도 있다. (ex : myql)
 	- 오라클은 전반적으로 시퀀스를 따로 관리하는 것을 권장
 	
 	create sequence 이름[옵션];
 	대괄호는 생략 가능
 	
 	drop sequence 이름;
 	
 	select * from user_sequences; --내가 만든 모든 시퀀스의 정보가 다 나옴
 */
drop table item;
create table item(
item_no number primary key,
item_name varchar2(60) not null,
item_price number not null
);

drop sequence item_seq;

-- 기본 옵션으로 생성
create sequence item_seq;

-- 옵션을 지정하여 생성(1001번부터 9999번까지 1씩 증가, 캐시 없음)
create sequence item_seq
minvalue 1001
maxvalue 9999
increment by 1 --몇씩 증가하는지
start with 1001 --시작하는 숫자 번호
nocache;
--cache 5; --캐시 지정, 

insert into item(item_no, item_name, item_price)
--values(1, '컴퓨터', 1000000)
values(item_seq.nextval, '컴퓨터', 1000000)

select * from item;

--시퀀스는 한 번 발행되면 끝이다. 번호가 굳이 바뀔 필요가 없다.

select * from user_sequences;
