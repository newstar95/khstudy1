CREATE TABLE score(
grade number(1),
room NUMBER,
name varchar2(21),
korean NUMBER(3),
english NUMBER(3),
math NUMBER(3)
);

INSERT INTO score(grade, room, name, korean, english, math)
VALUES(1,1,'마리오',50,60,50);

INSERT INTO score(grade, room, name, korean, english, math)
VALUES(1,1,'루이지',60,90,50);

INSERT INTO score(grade, room, name, korean, english, math)
VALUES(1,2,'쿠파',70,70,80);

INSERT INTO score(grade, room, name, korean, english, math)
VALUES(1,2,'요시',80,85,35);

SELECT * FROM score; --조회명령

DROP TABLE account; --삭제 명령

-- 이름을 만들다보면 쓸 수 없는 단어가 있다(예약어) 
CREATE TABLE account(
account_owner varchar2(21),
account_period NUMBER,
account_count NUMBER,
account_payment NUMBER,
account_balance NUMBER
);

INSERT INTO account(account_owner, account_period, account_count, account_payment, account_balance)
values('유재석',3,15,1000000,15000000);

INSERT INTO account(account_owner, account_period, account_count, account_payment, account_balance)
values('강호동',2,5,500000,2500000);

INSERT INTO account(account_owner, account_period, account_count, account_payment, account_balance)
values('신동엽',2,8,800000,10000000);

SELECT * FROM account;
