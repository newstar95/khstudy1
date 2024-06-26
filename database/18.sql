/*
종합문제

다음 요구사항에 맞는 테이블과 시퀀스를 생성하고 샘플데이터를 추가한 뒤 다음을 조회하시오.
--------------------------------------------------------------------------------------
<시퀀스> - kpop_song_seq
<테이블> - kpop_song
- kpop_song_no - 곡번호, 시퀀스로 부여
- kpop_song_title - 곡제목, 한글 100자 크기로 생성, 필수
- kpop_song_artist - 가수, 한글 100자 크기로 생성, 필수
- kpop_song_album - 앨범, 한글 100자 크기로 생성, 필수
- kpop_song_playcount - 재생횟수, 0이상 숫자로 생성, 기본값 0
- kpop_song_likecount - 좋아요횟수, 0이상 숫자로 생성, 기본값 0
*/
drop table KPOP_SONG;
CREATE TABLE kpop_song(
kpop_song_no NUMBER PRIMARY key,
kpop_song_title varchar(300) NOT null,
kpop_song_artist varchar(300) NOT null,
kpop_song_album varchar(300) NOT null,
kpop_song_playcount NUMBER DEFAULT 0
	check(kpop_song_playcount >= 0),
kpop_song_likecount NUMBER DEFAULT 0
	check(kpop_song_likecount >= 0)
);

CREATE SEQUENCE kpop_song_seq;

-- 데이터 추가 구문은 제공해 드립니다. --(PL/SQL 구문)
BEGIN
  FOR i IN 1..1000 LOOP
    INSERT INTO kpop_song (
      kpop_song_no,
      kpop_song_title,
      kpop_song_artist,
      kpop_song_album,
      kpop_song_playcount,
      kpop_song_likecount
    ) VALUES (
      kpop_song_seq.NEXTVAL,
      'Sample Title ' || i,
      'Sample Artist ' || i,
      'Sample Album ' || i,
      ROUND(DBMS_RANDOM.VALUE(10, 99999)), -- 재생 횟수 (10 이상 10만 미만)
      ROUND(DBMS_RANDOM.VALUE(10, 49999)) -- 좋아요 수 (10 이상 5만 미만)
    );
  END LOOP;
  COMMIT;
END;

SELECT * FROM kpop_song;

SELECT * FROM (
	SELECT rownum rn, TMP.* FROM (
		SELECT * FROM kpop_song ORDER BY kpop_song_likecount desc
	)TMP
) WHERE rn BETWEEN 1 AND 100;


SELECT * FROM (
	SELECT rownum rn, tmp.* FROM (
		SELECT * FROM kpop_song ORDER BY kpop_song_playcount DESC 
	)TMP
) WHERE RN BETWEEN 1 AND 100;


SELECT * FROM (
 SELECT rownum rn, TMP.* from(
 	SELECT kpop_song_no, kpop_song_title, kpop_song_artist, kpop_song_album, kpop_song_playcount, kpop_song_likecount,
kpop_song_playcount * 0.6 + kpop_song_likecount * 0.4 랭킹포인트 FROM kpop_song  ORDER BY 랭킹포인트 DESC 
 )TMP
) WHERE rn BETWEEN 1 AND 100
;

SELECT * FROM (
 SELECT rownum rn, TMP.* from(
 	select KPOP.*,
 	kpop_song_playcount * 0.6 + kpop_song_likecount * 0.4 랭킹포인트
 	from kpop_song kpop
 	order by 랭킹포인트 DESC 
	)TMP
) where rn BETWEEN 1 and 100;

-- 위 구문을 실행하면 1000개의 데이터가 들어갑니다.
-- (1) 좋아요를 가장 많이 받은 곡 Top 100을 출력
-- 좋아요 오름차순으로 정렬을 먼저 한 뒤 1부터 100까지의 행을 추출
-- (2) 재생을 가장 많이 한 곡 Top 100을 출력

-- (3) 랭킹포인트를 계산하여 Top 100을 출력
--      랭킹포인트는 재생수*0.6 + 좋아요*0.4 로 계산합니다
