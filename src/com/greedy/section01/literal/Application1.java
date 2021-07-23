package com.greedy.section01.literal; 

public class Application1 {		//클래스당 메인은 1개만 가능
	
	public static void main(String[] args) {
	
		//1. 숫자 형태의 값 
		System.out.println(123);		//1-1. 정수 형태의 값
		System.out.println(1.23);		//1-2. 실수 형태의 값
		
		//2. 문자 형태의 값 
		System.out.println('a');		//문자 형태의 값은 홀따옴표(single - quotation)사용
		//System.out.println('ab');		//두개 이상의 문자는 문자형이 아니기 때문에 에러발생
		//System.out.println('');		//공백도 에러발생
		System.out.println('1');		//문자 1로 판단
		
		//3. 문자열 형태의 값 (문자열: 문자 여러개가 나열된 형태)
		System.out.println("안녕하세요");	//문자열 형태의 값은 쌍따옴표(double - quotation)사용
		System.out.println("123");		//문자열 123으로 판단
		System.out.println("");			//공백 가능
		System.out.println("a");		//한 개의 문자도 쌍따옴표로 감싸면 문자열(문자형 X)
		
		//4. 논리 형태의 값 
		System.out.println(true);		//true or false 값
		System.out.println(false);		
	
	}
}
