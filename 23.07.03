##2023.07.03.Mon Day11 Project

전 시간 리뷰
시험 성적 정보를 자바에게 설명하기 위해 만드는 도구(클래스)
시험 성적 정보의 구성요소 데이터를 정의(멤버 필드) 멤버 필드(member field) - 데이터
멤버 메소드(member method) - 코드
String name;
	int korean;
	int english;
	int math;
변수 네 개를 묶어서 grade라고 부르겠다. 라고 자바에게 알려주는 것
지금은 객체가 생긴 게 아니고 클래스가 생긴 것, 클래스는 객체를 만들기 위한 설계도 같은 것.


Grade a = new Grade();
시험 성적 정보 1개를 저장

//a(리모컨) ----> Grade 객체(이름, 국어, 영어, 수학)


자주 쓰는 것들을 보관해놓고 불러오는 것을 모듈이라고 함

setup을 두 종류로 구현(메소드 오버로딩, method overloadaing) 
[1] 3개의 데이터가 들어오면 이벤트는 안 하는 걸로 생각하여 처리
[2] 4개의 데이터가 들어오면 이벤트 정보도 설정하는 걸로 처리

void setup(String name, String type, int money) {
		this.name = name;
		this.type = type;
		this.money = money;
		this.event = false;
	}
	
	void setup(String name, String type, int money, boolean event){
		//그래서 이쪽에서 할인하지 않음
		this.name = name;
		this.type = type;
		this.money = money;
		this.event = event;
		
	}

(문제점) show에서 너무 많은 일을 하고 있다.
(해결책) 계산을 메소드가 할 수 있도록 추가 메소드 생성
(참고) return 키워드는 "반환"과 "종료"의 의미를 가지는 키워드
(참고) void 키워드는 "결과물이 없음"이라는 의미를 가지는 키워드

메소드는 할일만 하고 끝나는 메소드 or 할일을 하고 내놓는 메소드(return이 있어야함)


이번 시간 리뷰
필드가 만들어져야 클래스의 나머지 형태를 구성할 수 있다.

필드를 하나씩 변경할 수 있는 메소드를 구현 - Setter 메소드
- set + 필드명으로 이름을 짓는다.
- 설정 외에 다른 작업을 하지 않는다.
- (중요) 올바른 데이터만 설정 가능하도록 필터링 처리를 한다.

이름에 대한 Setter 메소드
문자열은 비교를 switch로 한다.(if 방법은 나중에)
switch case는 정수랑 문자열만 사용 가능하다.

this.score 쓰면 안됨, 괄호 안에 있는 전달받은 score를 말하는 것.

코드의 문제점
[1] 잘못된 데이터 설정 가능
[2] 하나의 정보만 바꿀 수 없다.
- 점수를 바꾸고 싶은데 이름까지 적어야 한다.
- 이름을 바꾸고 싶은데 점수까지 적어야 한다.
  -변수에 직접적으로 접근하는 일은 좋지 않음(잘못된 데이터를 막을 수 없음)

[1]해결법 - 데이터를 설정하는 부분에 조건을 추가하면 된다.
[2]데이터를 하나만 설정할 수 있는 메소드를 만든다.(Setter 메소드)

필드 개수와 세터 메소드 개수가 같아야 한다.
세터 메소드는 셋 + 필드명으로 이름을 설정한다.
어떠한 경우에도 세터 메소드로 연결시켜서 데이터 차단이 이루어지게 해야한다.
