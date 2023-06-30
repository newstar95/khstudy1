package oop.method3;

public class Test01 {

	public static void main(String[] args) {
		CompanyPrice c1 = new CompanyPrice();
		CompanyPrice c2 = new CompanyPrice();
		CompanyPrice c3 = new CompanyPrice();
		
		
//		c1.name = "5G 언택트 52"; //바람직하지 않은 방법
		c1.setup("SK", "5G언택트 52", 52000, 200, 1000, 2000);
		c2.setup("KT", "5G세이브", 45000, 100, 900, 1500);
		c3.setup("LG", "5G시그니처", 130000, 500, 2000, 2500);
		
		//출력
		c1.show();
		c2.show();
		c3.show();

	}

}
