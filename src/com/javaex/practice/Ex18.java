package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		/*
		  알파벳을 입력받아 자음 모음을 구분하세요. 
		  ⦁ switch~case문을 사용합니다. 
		  ⦁ 영문 소문자 이외의 입력값은 고려하지 않습니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		char alphabet = sc.next().charAt(0);

		switch (alphabet) {
		case 'a':
		case 'i':
		case 'o':
		case 'u':
		case 'e':
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("자음입니다.");
			break;

		}
		
		// 모음 : A,I,O,U,E
		// 자음 : B,C,D,F,G,H,J,K,L,M,N,P,Q,R,S,T,V,W,X,Y,Z
		

		sc.close();
	}

}
