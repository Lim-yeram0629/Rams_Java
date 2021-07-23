package com.greedy.section05.typecasting;

public class Application2 {
	public static void main(String[] args) {
		
		/* 2. 강제 형변환 
		 * 
		 * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환
		 * 예) (바꿀 자료형) 값;
		 */
		
		/* 자동 형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
		 * 1. 강제 형변환 규칙
		 * 1-1. 큰 자료형에서 작은 자료형으로 변경 
		 * 1-2. 실수를 정수로 변경
		 * 1-3. 문자형을 int미만 크기의 변수에 저장
		 * 1-4. 논리형은 강제 형변환 규칙에서도 제외
		 */
		
		// 1-1. 큰 자료형에서 작은 자료형으로 변경 
		// 1-1-1. 정수끼리의 강제 형변환
		long lnum = 8;
		//int inum = lnum;	//데이터 손실 가능성을 컴파일러가 알려줌(에러)
		int inum = (int)lnum;	// 변경하려는 자료형을 명시하여 강제 형변환
		short snum = (short)inum;	
		byte bnum = (byte)snum;	
		System.out.println("bnum : " + bnum);
		
		// 1-1-2. 실수끼리의 강제 형변환
		double dnum =8.0;
		//float fnum = dnum;
		float fnum = (float)dnum;
		System.out.println("fnum : " + fnum);

		// 1-2. 실수를 정수로 변경
		float fnum2 = 4.0f;
		//long lnum2 = fnum2;	// float의 가수부(소숫점)자료의 손실 가능성을 컴파일러가 알려줌(에러)
		long lnum2 = (long)fnum2;
		System.out.println("fnum2 : " + fnum2);

		// 1-3. 문자형을 int미만 크기의 변수에 저장
		char ch = 'a';
		//byte bnum2 = ch;	// char자료형 보다 작기 때문에(에러)
		byte bnum2 = (byte)ch;
		//short snum2 = ch;	// 같은 크기 지만, 부호비트의 값이 다르기 때문에 형변환
		short snum2 = (short)ch;
		
		int num1 = 97;
		int num2 = -97;
		char ch2 = (char)num1;
		char ch3 = (char)num2;	// 음수도 가능
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		
		// 1-4. 논리형은 강제 형변환 규칙에서도 제외
		boolean isTrue = true;
		//String str = (String)isTrue;
		
	}

}
