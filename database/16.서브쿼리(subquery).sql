-----------------------------------------------------------------
-- 서브쿼리(sub query)
-----------------------------------------------------------------
-- 여러 개의 구문을 순차적으로 실행하도록 만드는 기술

-- (ex) 가장 비싼 금액의 상품 정보를 조회
-- 따로 했을 경우
select max(price) from product;
select * from product where price = 3000;

-- 서브쿼리로 변환해서 같이 한 경우
select * from product where price = (
select max(price) from product
);

-- (Q) 가장 최근에 제조된 상품 정보
select * from product where made = (select max(made) from product);
-- (Q) 가격이 가장 저렴한 책 정보
select * from book where book_price = (select min(book_price) from book);

-- 가격이 비싼 순서로 3개만 조회
