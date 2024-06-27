package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		/*
		 * 아래와 같은 계산기 프로그램을 작성하세요. 기호, 숫자1, 숫자2 순서로 입력받습니다. 기호는 ( + - * / ) 4가지 입니다. 입력된
		 * 내용으로 계산하여 결과값을 출력합니다. 나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("출력되는 내용을 입력하세요");

		System.out.print("기호: ");
		char symbol = sc.next().charAt(0);

		System.out.print("숫자1: ");
		int num1 = sc.nextInt();

		System.out.print("숫자2: ");
		double num2 = sc.nextInt(); // 정수를 0으로 나누려 하면 java.lang.ArithmeticException: / by zero 오류 발생

		double plus = num1 + num2;
		double minus = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;

		if (symbol == '+') {
			System.out.println("결과는: " + plus);
		} else if (symbol == '-') {
			System.out.println("결과는: " + minus);
		} else if (symbol == '*') {
			System.out.println("결과는: " + mult);
		} else if (symbol == '/') {
			if (num2 != 0) {
				System.out.println("결과는: " + div);
			} else {
				System.out.println("계산할 수 없습니다.");
			}
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
		}

		sc.close();

	}

}
