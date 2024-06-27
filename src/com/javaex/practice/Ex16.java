package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		// 다음과 같이 정의되는 함수의 함수값을 계산해보자

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int x = sc.nextInt();

		double result;

		if (x <= 0) {
			result = Math.pow(x, 3) - (9 * x) + 2; // 거듭제곱 함수 사용
		} else {
			result = (7 * x) + 2;
		}

		System.out.println("계산결과는 " + result + " 입니다.");
		
		sc.close();
	}

}
