package com.greedy.section04.overflow;

public class Application1 {
	
	public static void main(String[] args) {
		/* 오버플로우 
		 * 자료형 별 값의 최대 범위를 벗어나는 경우
		 */
		
		byte bnum1 = 127;
		System.out.println("bnum1 : " + bnum1);
		
		bnum1++;
		System.out.println("bnum1 overflow : " + bnum1);
		
		/* 언더플로우 (오버플로우의 반대 개념)
		 * 자료형 별 값의 최소 범위보다 작은수를 발생시키는 경우
		 */
		byte bnum2 = -128;		
		System.out.println("bnum2 : " + bnum2);
		
		bnum2--;
		System.out.println("bnum2 underflow : " + bnum2);
		
		int firstNum = 1000000;	
		int secondNum = 700000;
		
		int multi = firstNum * secondNum;
		
		System.out.println("firstNum * secondNum = " + multi);
		
		//해결 방안
		long longMulti = firstNum * secondNum;
		//이미 오버플로우 처리된 결과를 가지고 변수에 담기 때문에 위의 결과랑 차이가 없음
		System.out.println("firstNum * secondNum = " + longMulti);
		
		/* 계산 처리 전 강제 형 변환으로 바꿔줘야 한다. */
		long result = (long)firstNum * secondNum;
		System.out.println("firstNum * secondNum = " + result);

	}

}
