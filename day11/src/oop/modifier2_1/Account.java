package oop.modifier2_1;

public class Account {
	//멤버 필드
	private String name; //예금주명
	private int year; //총 기간
	private int count; //진행된 입금회차
	private int pay; //1회 입금액
	private int balance; //잔액
	
	
	//멤버 메소드
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
		switch(year) { //별말이 없으면 가까운 year 쪽으로 간다. this를 붙이면 멤버 필드쪽으로 간다.
		case 1: case 2: case 3: case 5: case 10:
			this.year = year;
		}
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		if(count < 1) return;
		if(count > this.getToalCount()) return;
		this.count = count;
	}
	
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		if(pay <= 0) return;
		this.pay = pay;
	}
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance <= 0) return;
		this.balance = balance;
	}
	
	
	public int getMonth() {
		return this.year * 12;
	}
	
	public int getToalCount() {
		return this.getMonth() + 1;
	}
	
	//만기인지 아닌지 판정하는 메소드
	//(참고) 논리가 반환값인 Getter 메소드는 get이 아닌 is로 시작하게 작명
	public boolean isFinish() {
//		if(this.getToalCount() == this.getCount()){
//			return true;
//		} else {
//			return false;
//		}
	return this.getToalCount() == this.getCount();
	}
	
	//생성자
	
//	public Account(예금주, 기간, 납입금액) {
//		
//	}
//	public Account(예금주, 기간,납입금액, 회차, 잔액) {
//		
//	}
	public Account(String name, int year, int pay) {
		this(name,  year,  pay,  1, 0); //보증금이 2000원이라면 pay에 2000을 넣으면 됨
	}
	public Account(String name, int year, int pay, int count, long balance) {
		this.setName(name);
		this.setYear(year);
		this.setPay(pay);
		this.setCount(count);
		this.setBalance(count);
		
		if(this.isFinish()) {
			System.out.println("* 해당 적금은 만기되었습니다* ");
		}
	}
	
	
	public void show() {
		System.out.println("<KH 내집마련 적금통장 가입자 정보>");
		System.out.println("예금주: " + this.getName());
		System.out.println("예치기간: " + this.getYear() + "년(" + this.getMonth() + ")개월");
		System.out.println("월부금: " + this.getPay() + "원");
		System.out.println("납입회차: " + this.getCount() + "/" + this.getToalCount() + "회차");
		System.out.println("계좌잔액: " + this.getBalance() + "원");
	}
	
	
}
