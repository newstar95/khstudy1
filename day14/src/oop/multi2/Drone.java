package oop.multi2;

public class Drone implements Transportation, Electronic, Flyable {

	@Override
	public void fly() {
		System.out.println("드론이 비행합니다.");
	}

	@Override
	public void On() {
		System.out.println("드론의 전원을 켭니다.");
	}

	@Override
	public void Off() {
		System.out.println("드론의 전원을 끕니다.");
	}

	@Override
	public void move() {
		System.out.println("드론이 이동합니다.");
	}

}
