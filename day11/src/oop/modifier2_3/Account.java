package oop.modifier2_3;

//적금계좌 클래스
public class Account {
	//멤버 필드
	private String name;//예금주명
	private int year;//총 기간
	private int count;//진행된 입금회차
	private int pay;//1회 입금액
	private int balance;//잔액

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
		switch(year) {
		case 1: case 2: case 3: case 5: case 10:
			this.year = year;
		}
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		if(count < 1) return;
		if(count > this.getTotalCount()) return;
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
	public int getTotalCount() {
		return this.getMonth() + 1;
	}

	//만기인지 아닌지 판정하는 메소드
	//(참고) 논리가 반환값인 Getter 메소드는 get이 아니라 is로 시작하게 작명
	public boolean isFinish() {
		//if(this.getTotalCount() == this.getCount()) {
		//	return true;
		//}
		//else {
		//	return false;
		//}
		return this.getTotalCount() == this.getCount();
	}

	public int getRemainCount() {
		return this.getTotalCount() - this.count;
	}

	//만기 예상 금액 출력
	//= 현재잔고 + 남은횟수*월부금
	public int getFuture() {
		return this.balance + this.getRemainCount() * this.pay;
	}

	public void show() {
		System.out.println("<계좌 정보>");
		System.out.println("예금주 : " + this.name);
		System.out.println("예치기간 : " + this.year + "년 ("+this.getMonth()+"개월)");
		System.out.println("월부금 : " + this.pay+"원");
		System.out.println("납입회차 : ("+this.count+" / "+this.getTotalCount()+")");
		System.out.println("계좌잔액 : " + this.balance+"원");

		if(this.isFinish()) {
			System.out.println("* 해당 적금은 만기되었습니다 *");
		}
		else {
			System.out.println("* 만기 예상금액 : " + this.getFuture()+"원 *");
		}
	}

	//1개월이 지나면 변하는 것 = 납입횟수, 잔액
	public void next() {
		if(this.isFinish()) return;

		this.count++;
		this.balance += this.pay;
	}

	//생성자
	public Account(String name, int year, int pay) {
		this(name, year, pay, 1, 0);
	}
	public Account(String name, int year, int pay, int count, int balance) {
		this.setName(name);
		this.setYear(year);
		this.setPay(pay);
		this.setCount(count);
		this.setBalance(balance);
	}
}
