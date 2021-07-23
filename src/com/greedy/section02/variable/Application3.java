package com.greedy.section02.variable;

public class Application3 {
	public static void main(String[] args) {
		/*	1. 컴파일 에러 발생 규칙 */
		//	1-1. 동일한 범위 내, 동일한 변수명을 가질 수 없다.
		int age = 20;	// int age = 30; -> 불가
		
		/*	1-2.  예약어 사용 불가
		 * int true;
		 * int for; 
		 */
		
		//	1-3. 대/소문자 구분
		int Age = 20;
		int True = 10;
		
		//	1-4. 숫자로 시작할 수 없다.
		//	int 1age = 20; -> 불가
		int age1 = 20; 
		
		//	1-5. 특수문자 '_'와'$'만 사용가능
		int $age = 20;
		int _age = 20;
		
		/* 2. 암묵적인 규칙 */
		//	2-1. 적당한 길이의 변수명 작성(길이의 제한은 없음)
		int asfjidslknviosdkfniosoiefnklsndiocnkdsnklf;
		//	2-2. 합성어는 첫 단어는 소문자 그 이후 단어의 첫 글자는 대문자로 시작(camel-case)
		//	2-3. 단어와 단어 사이는 언더스코어(_) 사용 안함
		//	2-4. 영어 권장(한글도 가능하긴 함)
		//	2-5. 변수 안에 저장된 값이 어떤 의미인지 알 수 있도록 이름 짓기
		//	2-6. 전형적인 변수명이 있다면 가급적 사용 권장
		//	2-7. 명사형으로 작성
		//	2-8. boolean형은 의문문으로 작성하고 가급적 긍정형으로 이름짓기
	}

}
