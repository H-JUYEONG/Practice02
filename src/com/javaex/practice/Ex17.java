package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/*
		 * 다음과 같이 수익을 입력받아 소득세를 계산하는 프로그램을 작성하세요 ⦁ 세금계산법 ⦁ 0원이상 1000만원 이하인 경우 tax:
		 * 0.09*수익 ⦁ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000) ⦁ 4000만원 초과
		 * 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000) ⦁ 8000만원 이상인 경우
		 * tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("수익을 입력해 주세요");
		System.out.print("금액: ");
		int money = sc.nextInt();

		double tax;

		if (money > 0 && money <= 1000) {
			tax = 0.09 * money;
		} else if (money > 1000 && money <= 4000) {
			tax = (1000 * 0.09) + (0.18 * (money - 1000));
		} else if (money > 4000 && money < 8000) {
			tax = (1000 * 0.09) + (3000 * 0.18) + (0.27 * (money - 4000));
		} else {
			tax = (1000 * 0.09) + (3000 * 0.18) + (4000 * 0.27) + (0.36 * (money - 8000));
		} // if문을 else if로 끝낼경우 tax에 값이 들어가지 않을 경우가 있기 때문에 tax에 초기값 설정이 필요

		if (money > 0) {
			System.out.println("소득세는 " + tax + " 입니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	}

}
