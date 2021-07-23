package com.greedy.section03.constant;

public class Application2 {
	
	public static void main(String[] args) {
		/*
		 * 상수의 명명 규칙
		 * 상수의 명명 규칙은 변수의 명명 규칙(컴파일 에러를 발생시키는 규칙)은 동일하다.
		 * 
		 * 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.
		 * 2. 단어와 단어의 연결은 언더스코어(_)를 사용한다.
		 */
		
		// 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용
		final int AGE1 = 20;
		final int AGE2 = 30;
		final int age3 = 40;	//소문자 사용은 가능하지만 변수와 구분을 위해 대문자 사용 권장
		
		// 2. 단어와 단어 연결은 언더스코어(_)사용
		final int AGE_1 = 20;
	}

}
