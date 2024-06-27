package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		// 두개의 숫자를 입력받아 큰수와 작은수를 분류하여 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();

		int quotient, remainder;

		if (num1 > num2) {
			quotient = num1 / num2; 
			remainder = num1 % num2;
			System.out.println("몫: " + quotient);
			System.out.println("나머지: " + remainder);
		} else { // num1, num2 입력값이 같은 경우도 포함
			quotient = num2 / num1;
			remainder = num2 % num1;
			System.out.println("몫: " + quotient);
			System.out.println("나머지: " + remainder);
		}

		sc.close();

	}

}
