create table book(
book_id number primary key,

book_title varchar2(300) not null,

book_author varchar2(90) check(regexp_like(book_author, ('[^!@#$]+'))),

book_publication_date char(10)
check(regexp_like(book_publication_date, ('^(1[89][0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$'))),

book_price number(*,2) not null 
check (book_price >= 0),

book_publisher varchar2(90) not null,

book_page_count number
check (book_page_count >= 1),

book_genre varchar2(30) not null
check(book_genre in ('Classic', 'Fantasy', 'Romance'))
);

create sequence book_seq;

insert into book(book_id, book_title, book_author, book_publication_date, book_price, 
book_publisher, book_page_count, book_genre) 
values (book_seq.nextval, 'Harry Potter 1', 'J.K. Rowling', '2001-06-26', 19.99, 'Scholastic', 320, 'Fantasy');

insert into book(book_id, book_title, book_author, book_publication_date, book_price, 
book_publisher, book_page_count, book_genre) 
values (book_seq.nextval, 'To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 14.99, 'Grand Central Publishing', 336, 'Classic');

insert into book(book_id, book_title, book_author, book_publication_date, book_price, 
book_publisher, book_page_count, book_genre) 
values (book_seq.nextval, 'Pride and Prejudice', 'Jane Austen', '1813-01-28', 9.99, 'Penguin Classics', 432, 'Romance');

SELECT * from book;
