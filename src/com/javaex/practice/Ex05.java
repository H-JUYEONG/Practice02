package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		// 아래와 같이 작성된 코드가 있다. 보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요.

		int age;

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();

		if (age > 20) { // 20살 초과
			System.out.print("\"1번그룹\"");
		} else { //20살 이하
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다.");

		sc.close();
		
		/* 결과값
		 
		  (1)15일때 결과: '2번그룹'입니다.
		  (2)19일때 결과: '2번그룹'입니다..
		  (3)20일때 결과: '2번그룹'입니다.
		  (4)21일때 결과: "1번그룹"입니다.
		  (5)100일때 결과: "1번그룹"입니다.
		  
		 */
		
	}

}
