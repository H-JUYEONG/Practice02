package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		/* 
		  아래의 조건과 같이 출력되도록 프로그램을 작성하세요
		  ⦁ 태어난 년도를 입력받습니다.
		  ⦁ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3) 
		  ⦁ 성인(20세 이상) 이면 무료료 건강검진을 받을 수 있습니다.
		  ⦁ 짝수해 태어난 사람은 올해가 짝수해 이면 검사대상이고 올해가 홀수해 이면 검사대상이 아닙니다.
		  (홀수해 태어난 사람이 올해가 홀수해 이면 검사대상 올해가 짝수해 이면 검사대상이 아닙니다.)
		  ⦁ 40세 이상의 경우에는 암 검사도 무료료 검사 받을 수 있습니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");

		int year = sc.nextInt(); // 태어난 년도

		int currentYear = 2023; // 현재 년도
		int age = currentYear - year; // 나이

		System.out.println("올해: " + currentYear);
		System.out.println("태어난해: " + year);
		System.out.println("나이: " + age);
		System.out.println("=============================");

		boolean even = (year % 2 == 0); // 태어난 년도가 짝수인지 홀수인지 확인
		boolean odd = (currentYear % 2 == 0); // 현재 년도가 짝수인지 홀수인지 확인

		if (age >= 20) { // 나이가 20살 이상인 경우
			System.out.println("20살이상");
			if ((even && odd) || (!even && !odd)) { // 짝수+짝수 이거나 홀수+홀수인 경우
				System.out.println("건강검진해");
				if (age >= 40) { // 건강검진해 + 40살 이상인 경우
					System.out.println("암 검사");
				} else {
					System.out.println("암 검사X");
				}
			} else { // 짝수+짝수 이거나 홀수+홀수가 아닌 경우
				System.out.println("건강검진해 아님");
			}

		} else { //위 조건에 해당하지 않는 경우
			System.out.println("20살미만 건강검진대상이 아님");
		}

		sc.close();
	}

}
