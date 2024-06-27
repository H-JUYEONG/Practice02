package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		// 숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 3개를 입력해주세요");

		System.out.print("숫자1: ");
		int num1 = sc.nextInt();

		System.out.print("숫자2: ");
		int num2 = sc.nextInt();

		System.out.print("숫자3: ");
		int num3 = sc.nextInt();

		int min = num1; // 일단 num1을 최소값으로 설정

		if (min > num2) { // 최소값으로 설정해놓은 num1과 num2를 비교
			min = num2; // num1과 num2을 비교해서 num2이 더 작을 경우 min에 num2 값 세팅
		}

		if (min > num3) { // num2와 num3을 비교하는것과 동일
			min = num3; // num1과 num2을 비교해서 num2이 더 작을 경우 min에 num3 값 세팅
		}

		System.out.println("가장 작은수는 " + min + " 입니다.");

		sc.close();

	}

}
