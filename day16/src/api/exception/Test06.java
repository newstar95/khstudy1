package api.exception;

import java.util.Scanner;

	public class Test06 {
		public static void main(String[] args) {
			try {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("입력(YYYY-MM): ");
				String input = sc.next();
				
				sc.close();
				
				String year = input.substring(0,4);
				String month = input.substring(5,7);
				
				int num1 = Integer.parseInt(year);
				int num2 = Integer.parseInt(month);
				
				int yy = 2023;
				int mm = 7;
				
				//else if를 할 필요가 없다. 따로 조건이기 때문에 굳이 묶을 필요x
				if (num1 > yy || num1 < 1900) { 
					throw new Exception("년도가 올바르지 않습니다.");
				}
				
				if (num2 < 1 || num2 > 12) { 
					throw new Exception("1~12 사이의 날짜를 입력하세요.");
				}
				
				int kAge = yy - num1 + 1;
				
				int eAge = 0;
				if (mm >= num2) {
					eAge = kAge - 1;
				} else if (num2 >= mm) {
					eAge = kAge - 2;
				}
				System.out.println("한국나이: " + kAge); 
				System.out.println("만나이: " + eAge); 
			} 
			
			catch (Exception e) { 
				if(e.getMessage() == null) {
					System.err.println("오류 발생"); 
						} else {
							System.err.println(e.getMessage());
						}
					} 
				}
		}