package com.greedy.section02.variable;

public class Application2 {
	
	public static void main(String[] args) {
		/* 변수를 사용하기 위한 방법 
		 * 1. 변수 준비(선언)	-> 자료형 변수명;
		 * 2. 변수 값 대입(초기화 밒 값 대입) 변수명 = 값;
		 * 3. 변수 사용
		 */
		
		/* 1. 변수 준비(선언) */
		/* 1-1. 변수 선언 방법 */
		// 1-1-1. 숫자를 취급하는 자료형
		// 정수형(4가지)
		byte bnum;		//1byte
		short snum;		//2byte
		int inum;		//4byte
		long lnum;		//8byte
		
		//실수형(2가지)
		float fnum;		//4byte
		double dnum;	//8byte
		
		// 1-1-2. 문자를 취급하는 자료형
		char ch, ch2; 		//2byte
		
		// 1-1-3. 논리값을 취급하는 자료형
		boolean isTrue; 		//1byte
		
		// 1-1-4. 문자열을 취급하는 자료형
		String str;		//4byte 정도의 주소 값을 가짐
		
		/* 2. 변수에 값을 대입(값 대입 및 초기화) 
		 * 위에서 한 변수 선언은 메모리에 값을 지정하기 이해 공간만 생성해 둔 상태.
		 * 그 공간에 대입 연산자(=)를 이용하여 자료형에 저장하기로 한 형태의 값을 저장할 수 있다.
		 * 만약, 명시한 자료형과 다른 형채의 값을 대입하려 하면 에러 발생
		 * 
		 * 대입 연산자의 실행방향은 오른쪽(값)에서 왼쪽(공간)
		 * 항상 왼쪽에는 공간, 오른쪽에는 값 -> 변수를 왼쪽에 두면 공간, 오른쪽에 두면 값을 의미
		 */
		
		// 2-1. 정수형에 값 대입
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L; // 소문자 보다는 대문자로 써야 1과 헷갈리지 않는다.
		
		// 2-2. 실수형에 값 대입
		fnum = 4.0f;	//f없으면 double형으로 인지하기 때문에 오류(대문자보단 소문자가 일반적)
		dnum = 8.0;		//8.0d d는 생략가능
		
		// 2-3. 문자형에 값 대입
		ch = 'a';
		ch2 = 97;		// 결과 = 'a'
		
		// 2-4. 논리형에 값 대입
		isTrue = true;
		isTrue = false;
		
		// 2-5. 문자열을 취급하는 자료형에 값 대입
		str = "안녕하세요";
		
		/* 선언과 동시에 초기화 */
		int point = 100;
		int bonus = 10;
		
		/* 초기화한 변수들 출력*/
		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);
		
		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);
		
		System.out.println("ch의 값 : " + ch);
		System.out.println("ch2의 값 : " + ch2);
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("str의 값 : " + str);
		
		point = point + 100;
		System.out.println("point = point + 100 ? " + point);
	
		
		
		
	}
}
