package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		// 숫자(정수) 3개를 입력받아 가장 큰 수를 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();

		System.out.print("숫자2: ");
		int num2 = sc.nextInt();

		System.out.print("숫자3: ");
		int num3 = sc.nextInt();

		int max = num1; // 일단 max에 num1을 가장 큰 값으로 세팅

		if (max < num2) { // 최대값으로 설정해놓은 num1과 num2를 비교
			max = num2; // num1과 num2을 비교해서 num2이 더 클 경우 max에 num2 값 세팅
		}

		if (max < num3) { // num2와 num3중에 더 큰 값을 비교
			max = num3; // num2과 num3을 비교해서 num3이 더 클 경우 max에 num3 값 세팅
		}

		System.out.println("가장 큰수는 " + max + " 입니다.");
		
		sc.close();
	}

}
