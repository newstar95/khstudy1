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
		this.year = year;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Account(String name, int year,int pay) {
		this(name,year,pay,1,0);
	}
	
	public Account(String name, int year,int pay, int count, int balance) {
		this.name = name;
		this.year = year;
		this.count = count;
		this.pay = pay;
		this.balance = balance;
	}
	
	public void show() {
		System.out.println("<통장 정보>");
		System.out.println();
		System.out.println("예금주: " + this.name);
		System.out.println("적금기간: " + this.year);
		System.out.println("현재납입회차: " + this.count);
		System.out.println("월납입금액: " + this.pay);
		System.out.println("총잔액: " + this.balance);
	}
	
	
}
