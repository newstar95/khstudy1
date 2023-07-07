[api](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html)

### 문자열 검사
전부 또는 일부분에 대한 검사를 위한 명령

#### api에서 자주 나오는 단어
- prefix 접두사 (앞에 붙는 글자)
- suffix 접미사 (뒤에 붙는 글자)

### 한글
- 한글은 낱자 따로 저장되어 있다.
- (★) 한글의 첫 번째 글자와 마지막 글자: 가 / 힣 (44032 / 55203)

1. 문자열에 특정 단어가 포함되어 있는가?
name.contains("");
2. 문자열에 특정 단어가 포함되어 있는 위치를 확인
name.indexOf("");
  1,2. contains를 indexOf로 쓰는 방법
  name.indexOf("") >= 0;

#### 문자열은 배열처럼 0부터 시작하도록 구성되어 있다.

3. 문자열에 특정 단어가 어디 있는지 좌측부터 탐색
name.indexOf("");
4. 문자열에 특정 단어가 어디 있는지 우측부터 탐색
name.lastIndexOf("");
  3,4. indexOf를 사용하여 문자열에 특정 단어가 있는지 없는지 알 수 있는 방법
  name.indexOf("없는 글자");
  없으면 -1이 나온다. 문자열에서 절대 나올 수 없는 음수의 값이 나오는 것이 곧 없는 값이라는 뜻

5. 문자열에 특정 단어로 시작하는지 확인
uri.startsWith(""); //""로 시작합니까?
6. 문자열에 특정 단어로 끝나는지 확인
uri.endsWith(""); //""로 끝납니까?
```
System.out.println(uri.lastIndexOf(".com") == uri.length() - ".com".length());
```
위 처럼 쓰는 것은 피하자!

7. 문자열 n번 위치에 원하는 글자를 추출
text.charAt(n);
```
//쉽게 구현하는 방법
boolean isAlphabet = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch<= 'z'); //알파벳인가
boolean isKorean = ch >= '가' && ch <= '힣'; //한글인가
```



### 정규표현식
문장을 검사하기 위한 식


[정규표현식 시각화 사이트](https://regexper.com/)
[가 - 힣] 
[0 - 9]
[a - z]
[A - Z]
[A-Za-z]

[가 - 힣] = 한 글자
[가 - 힣] = 두 글자
[가 - 힣]{3} = (3글자)
[가 - 힣]{3,7} = (3~7글자)
^[가 - 힣]$ = 시작^ / 끝$

how secure is my password
