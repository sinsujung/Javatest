package com.test.question;

import java.util.Arrays;
import java.util.Random;

public class Q066 {
	
	public static void main(String[] args) {
		//요구사항] 중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		/*
		  	조건]
		     숫자의 범위: 1~45
		     오름차순 정렬
		     
		 */
		// 중복된지 않는 임의의 숫자 6개를 만드시오.(로또)
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {

			int n = (int) (Math.random() * 45) + 1;

			if (isDuprlcate(lotto, n)) {
				i--;
			} else {
				lotto[i] = n;

			}

		}

		Arrays.sort(lotto); //오름차순으로 정렬 해주는 arrays.sort 메소드
		
		System.out.println(Arrays.toString(lotto));
	}

	private static boolean isDuprlcate(int[] lotto, int n) {

		for (int i = 0; i < lotto.length; i++) {

			if (lotto[i] == n) {

				return true;
			}
		}
		return false;

	}// main

}
