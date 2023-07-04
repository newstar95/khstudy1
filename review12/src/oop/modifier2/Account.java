package oop.modifier2;

public class Account {
	private String name;
	private int year;
	private int count;
	private int pay;
	private int balance;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		switch (year) {
		case 1: case 2: case 3: case 5: case 10: //기간을 1,2,3,5,10 중 선택 가능하게 
			this.year = year;
		}
		
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		if(count < 1) return; //최초 납입 1회
		if(count > this.getTotalCount()) return; //납입을 모두 완료했으면 들어가지 않게
		this.count = count;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		if (pay % 10000 == 0) return; //월 납입금액을 만원 단위로 설정
		this.pay = pay;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance <= 0) return; // 잔액이 0이거나 -이면 들어가지 않게
		this.balance = balance;
	}
	
	//복습 요구사항
	public int getMonth() {
		return this.getYear()  * 12; //적금기간 년수를 월수로 바꾸는 메소드
	}
	
	public int getTotalCount() {
		return this.getMonth() * + 1; //만기일때 납입 회차
	}
	
	public boolean isAnd() { //만기인지 아닌지 판정
		return this.getTotalCount() == this.getCount();
	}
	
	public int getRemainCount() { //만기까지 몇 번의 납입이 남았는지 확인
		return this.getTotalCount() - this.count;
		
	}
	
	public int getFuture() { //만기 예상 금액 
		return this.balance + this.pay * getRemainCount();
	}
	
	public Account(String name, int year,int pay) {
		this(name,year,pay,1,0);
	}
	
	public Account(String name, int year,int pay, int count, int balance) {
		this.name = name;
		this.year = year;
		this.pay = pay;
		this.count = count;
		this.balance = balance;
	}
	
	public void show() {
		System.out.println();
		System.out.println("<통장 정보>");
		System.out.println("예금주: " + this.name);
		System.out.println
				("적금기간: " + this.year + "년" + "(" + this.getMonth() + "개월" + ")");
		System.out.println("현재납입회차: " + this.count + "회차");
		System.out.println("만기납입회차: " + this.getTotalCount() + "회차");
		System.out.println("월납입금액: " + this.pay + "원");
		System.out.println("총잔액: " + this.balance + "원");
		System.out.println("만기까지 남은 납입횟수: " + getRemainCount() + "번");
		System.out.println("만기 예상 금액: " +  getFuture() + "원");
	}
		
	public void isFinish() {
		if(this.getTotalCount() == this.count ) return;
	}
	
}
