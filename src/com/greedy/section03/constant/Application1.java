package com.greedy.section03.constant;

public class Application1 {

	public static void main(String[] args) {
		/* 상수란?
		 * 변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면,
		 * 상수는 이와는 상관없는 개념으로,
		 * 변하지 않는 값을(항상 고정된 값을) 저장해 두기 위한 공간
		 * 
		 * 상수의 사용 목적
		 * 변경되지 않는 고정된 값을 저장할 목적으로 사용
		 * 초기화 이후 값 대입시 컴파일 에러를 발생 시켜 수정 방지 
		 * 
		 * 사용방법
		 * 1. 상수를 선언한다. (변수 선언과 유사하지만 final 키워드를 사용한다.)
		 * 2. 값을 초기화 한다. (초기화 이후 변경 불가)
		 * 3. 필요한 위치에 상수를 호출시켜 사용.
		 * 
		 */
		
		//1. 상수 선언
		final int AGE;
		
		// 2. 초기화
		AGE = 20;
		// AGE = 30; -> 한번 초기화 한 후 값 대입 불가
		
		// 3. 필요한 위치에 상수를 호출해서 사용
		// 3-1. 출력구문에서 사용
		System.out.println("AGE의 값: " + AGE);
		
		// 3-2. 필요시 연산식에 호출해서 사용 가능
		System.out.println("AGE의 값 2배: " + (AGE * 2));
				
		// 3-3. 대입 연산자 활용
		int sum = AGE;
		// int AGE = AGE + 10; -> 대입연산자의 왼쪽에는 불가

	}

}
