package com.greedy.section01.literal;

public class Application2 {
	
	public static void main(String[] args) {
		
		//값의 형태별로 사용할 수 있는 연산자가 다른 것을 확인
		
		/* 1. 숫자의 연산  */
		//	1-1. 정수와 정수의 연산
		System.out.println("=====정수와 정수의 연산=====");
		System.out.println(123 + 456);
		System.out.println(123 - 23);
		System.out.println(123 * 10);
		System.out.println(123 / 10);
		System.out.println(123 % 10);
		
		// 1-2. 실수와 실수의 연산
		System.out.println("=====실수와 실수의 연산=====");
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.23);
		System.out.println(1.23 * 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 1.0);
		
		// 1-3. 정수와 실수의 연산 - 결과는 항상 실수
		System.out.println("=====정수와 실수의 연산=====");
		System.out.println(123 + 0.5);
		System.out.println(123 - 0.5);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);
		
//		/* 2. 문자 연산  */
//		// 2-1. 문자와 문자의 연산
//		System.out.println("=====문자와 문자의 연산=====");
//		System.out.println('a' + 'b');
//		System.out.println('a' - 'b');
//		System.out.println('a' * 'b');
//		System.out.println('a' / 'b');
//		System.out.println('a' % 'b');
//		
//		// 2-2. 문자와 정수의 연산
//		/*
//		 * 문자에 정수를 연산하는 것은 가능하다. 
//		 * 컴퓨터는 문자를 인식하지 못하고 숫자로만 인식 
//		 * 모든 문자에 대응되는 숫자들이 매칭되어 있다.(아스키코드와 유니코드)
//		 */
//		System.out.println("=====문자와 정수의 연산=====");
//		System.out.println('a' + 1);	//'a'의 아스키코드 값 = 97
//		System.out.println('a' - 1);	//97 - 1
//		System.out.println('a' * 2);	//97 * 2
//		System.out.println('a' / 2);	//97 / 2
//		System.out.println('a' % 2);	//97 % 2
//		
//		// 2-3. 문자와 실수의 연산
//		/*
//		 * 실수도 숫자이기 때문에 정수의 연산처럼 모든 연산 가능 
//		 * 단, 결과는 실수 형태로 나온다.
//		 */
//		System.out.println("=====문자와 실수의 연산=====");
//		System.out.println('a' + 1.0);	
//		System.out.println('a' - 1.0);
//		System.out.println('a' * 2.0);
//		System.out.println('a' / 2.0);
//		System.out.println('a' % 2.0);
//		
//		/* 3. 문자열 연산  */
//		// 3-1. 문자열와 문자열의 연산
//		System.out.println("=====문자열 문자열의 연산=====");
//		System.out.println("Hello" + " world");	//문자열 이어붙이기
//		//System.out.println("Hello" - " world"); //[-,*,/,%] 연산 불가(에러발생)
//		
//		// 3-2. 문자열와 다른형태의 연산
//		//[-,*,/,%] 연산 불가(에러발생)
//		System.out.println("=====문자열과 다른 형태의 값 연산=====");
//		System.out.println("Helloworld" + 123);		// 3-2-1. 문자열과 정수의 연산
//		System.out.println("Helloworld" + 123.456);	// 3-2-2. 문자열과 실수의 연산
//		System.out.println("Helloworld" + 'a');		// 3-2-3. 문자열과 문자의 연산
//		System.out.println("Helloworld" + true);	// 3-2-4. 문자열과 논리값의 연산
//		
//		System.out.println("=====문자열 형태의 숫자 값 값 연산(+)=====");
//		System.out.println("123" + "");
//		
//		/* 4. 논리값 연산  ('+'연산만 가능) */
//		// 4-1. 논리값과 논리값의 연산 -> 논리값 끼리의 연산 불가능
//		// 4-2. 논리값과 정수값의 연산 -> 논리값과 정수의 연산 불가능
//		// 4-3. 논리값과 실수값의 연산 -> 논리값과 실수의 연산 불가능
//		// 4-4. 논리값과 문자의 연산 -> 논리값과 문자의 사칙연산 불가능(a=97로 인식하기 때문에)
//		/* 4-5. 논리값과 문자열의 연산 -> '+'만 가능(true가 문자열 형태로 출력) */
	}

}
