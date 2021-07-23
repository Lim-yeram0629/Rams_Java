package com.greedy.section02.variable;

public class Application1 {
	
	public static void main(String[] args) {
		/*
		 * 변수의 사용 목적
		 * 1. 값에 의미를 부여하기 위한 목적
		 * 		- (의미 전달이 쉬워야 코드 읽기 쉬워지고, 협업 및 유지보수에 유리하다.)
		 * 2. 한번 저장해둔 값을 재사용하기 위해
		 * 3. 시간에 따라 변하는 값을 저장 및 사용
		 * 		- (변하는 값을 저장하기 위한 공간)
		 */
		
		/* 1. 값에 의미를 부여하는 목적 */
		System.out.println("=====값에 의미 부여=====");
		System.out.println("보너스 포함 급여" + (1000000 + 200000) + "원");
		
		//변수 선언 -> 자료형 변수명 = 값; 
		int salary = 1000000;
		int bonus = 200000;
		System.out.println("보너스 포함 급여" + (salary + bonus) + "원");
		
		/* 2. 한 번 저장해둔 값을 재사용하기 위한 목적 */
		System.out.println("=====변수 재사용=====");
		// 10명의 고객에게 100포인트 지급
		System.out.println("1번 고객에게 포인트를 100포인트를 지급했습니다.");
		System.out.println("2번 고객에게 포인트를 100포인트를 지급했습니다.");
		System.out.println("3번 고객에게 포인트를 100포인트를 지급했습니다.");
		System.out.println("4번 고객에게 포인트를 100포인트를 지급했습니다.");
		System.out.println("5번 고객에게 포인트를 100포인트를 지급했습니다.");
		System.out.println("6번 고객에게 포인트를 100포인트를 지급했습니다.");
		System.out.println("7번 고객에게 포인트를 100포인트를 지급했습니다.");
		System.out.println("8번 고객에게 포인트를 100포인트를 지급했습니다.");
		System.out.println("9번 고객에게 포인트를 100포인트를 지급했습니다.");
		System.out.println("10번 고객에게 포인트를 100포인트를 지급했습니다.");
		System.out.println("");
		
		int point = 1000;
		System.out.println("1번 고객에게 포인트를 "+ point +"를 지급했습니다.");
		System.out.println("2번 고객에게 포인트를 "+ point +"를 지급했습니다.");
		System.out.println("3번 고객에게 포인트를 "+ point +"를 지급했습니다.");
		System.out.println("4번 고객에게 포인트를 "+ point +"를 지급했습니다.");
		System.out.println("5번 고객에게 포인트를 "+ point +"를 지급했습니다.");
		System.out.println("6번 고객에게 포인트를 "+ point +"를 지급했습니다.");
		System.out.println("7번 고객에게 포인트를 "+ point +"를 지급했습니다.");
		System.out.println("8번 고객에게 포인트를 "+ point +"를 지급했습니다.");
		System.out.println("9번 고객에게 포인트를 "+ point +"를 지급했습니다.");
		System.out.println("10번 고객에게 포인트를 "+ point +"를 지급했습니다.");
		
		/* 3. 시간에 따라 변경되는 값을 저장하고 사용 */
		System.out.println("=====변수에 저장된 값 변경 테스트=====");
		
		int sum = 0; 	//int형태(정수)의 변수 초기 값은 0으로 지정해놈
		sum = sum + 10;	// sum = 0 + 10
		System.out.println("sum에 10을 더하면 현재 sum의 값은 : " + sum);

		sum = sum + 10;	// sum = 10 + 10
		System.out.println("sum에 10을 추가로 더하면 현재 sum의 값은 : " + sum);
		
		sum = sum + 10;	// sum = 20 + 10
		System.out.println("sum에 10을 추가로 더하면 현재 sum의 값은 : " + sum);
		
		
	}
}















