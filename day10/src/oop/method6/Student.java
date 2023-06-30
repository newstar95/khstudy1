package oop.method6;

public class Student {

	int grade;
	int group;
	String name;
	int korean;
	int english;
	int math;
	
	void setup(int grade, int group, String name, int korean, int english, int math) {
		this.grade = grade;
		this.group = group;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	void show() {
		System.out.println("<학생 성적 정보>");
		System.out.print(this.grade +" 학년 " );
		System.out.print(this.group + " 반 ");
		System.out.println("이름: " + this.name);
		System.out.println("국어 점수: " + this.korean);
		System.out.println("영어 점수: " + this.english);
		System.out.println("수학 점수: " + this.math);
		
		int total = this.korean + this.english +  this.math;
		System.out.println("총점: " + total + "점");
		
		float average = total / 3f;
		System.out.println("평균: " + average + "점");
		
		boolean pass = this.korean >= 40 && this.english  >= 40 && 
									this.math >= 40 && average >= 60;
		if ( pass ) {
			System.out.println("통과");
		} else {
			System.out.println("재평가");
		}
		
	}
	
}
