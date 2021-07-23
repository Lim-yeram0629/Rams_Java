package com.greedy.section01.literal;

public class Application3 {

	public static void main(String[] args) {
		/*문자열 합치기 테스트 */
		System.out.println("=====두 개의 문자열 합치기=====");
		System.out.println(9 + 9);		//18
		System.out.println("9" + 9);	//99
		System.out.println(9 + "9");	//99
		System.out.println("9" + "9");	//99
		
		System.out.println("=====세 개의 문자열 합치기=====");
		System.out.println(9 + 9 + "9");	//189 //'+'연산방향은 왼쪽에서 오른쪽
		System.out.println(9 + "9" + 9);	//999
		System.out.println("9"+ 9 + 9);		///999
		// 999의 결과를 918로 변경
		System.out.println("9" + (9 + 9)); //918
		/*맨 앞에 문자열을 두면 그 뒤의 리터럴들은 모두 문자열로 설정*/
		
		/*문자열 합치기 응용*/
		// 10과 20의 사칙 연산 결과 출력
		System.out.println("=====10과 20의 사칙 연산 결과=====");
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		System.out.println(10 / 20);
		System.out.println(10 % 20);
		
		// 결과 보기 좋게 출력
		System.out.println("=====10과 20의 사칙 연산 결과 보기 좋게 출력=====");
		System.out.println("10과 20의 합 : " + (10 + 20));
		System.out.println("10과 20의 차 : " + (10 - 20));
		System.out.println("10과 20의 곱 : " + (10 * 20));
		System.out.println("10과 20의 몫 : " + (10 / 20));
		System.out.println("10과 20의 나머지 : " + (10 % 20));
	}
}